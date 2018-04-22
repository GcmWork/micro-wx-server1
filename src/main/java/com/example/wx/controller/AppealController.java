package com.example.wx.controller;

import com.example.wx.common.Convert;
import com.example.wx.domain.InputModel.*;
import com.example.wx.domain.OutModel.*;
import com.example.wx.model.Appeal;
import com.example.wx.model.Student;
import com.example.wx.model.StudentRelation;
import com.example.wx.service.AppealService;
import com.example.wx.service.StudentRelationService;
import com.example.wx.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */

@Api(description="申诉相关接口")
@RestController
@RequestMapping("/appeal/")
public class AppealController
{
    @Autowired
    StudentService studentService;
    @Autowired
    AppealService appealService;
    @Autowired
    StudentRelationService studentRelationService;

    @ApiOperation("提交审核申请")
    @RequestMapping(value = "/submitappeal/", method = RequestMethod.POST)
    public BaseOutModel<SubmitAppealOut> submitappeal(@RequestBody SubmitAppealInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();
        if (input.getStudentid() == 0)
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("请填写绑定学生学号");
            return baseOutModel;
        }
        if (input.getOpenid().equals(""))
        {

            baseOutModel.setResult(0);
            baseOutModel.setMessage("请传入当前登录人的微信号");
            return baseOutModel;
        }
        if (input.getNewmobilephone().equals("")||input.getNewmobilephone()==null)
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("请传入要解绑的手机号");
            return baseOutModel;
        }
        if (input.getAppealtype() <= 0)
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("请传入申诉类型");
            return baseOutModel;
        }
        Appeal appeal = new Appeal();
        if (input.getAppealtype() == 1)
        {
            if (input.getAmount1().compareTo(BigDecimal.valueOf(0)) == 0 || input.getAmount2().compareTo(BigDecimal.valueOf(0)) == 0 || input.getAmount3().compareTo(BigDecimal.valueOf(0)) == 0)
            {
                baseOutModel.setResult(0);
                baseOutModel.setMessage("请填写三次充值金额");
                return baseOutModel;
            }
            if (input.getRechargetime1() == null || input.getRechargetime2() == null || input.getRechargetime3() == null)
            {
                baseOutModel.setResult(0);
                baseOutModel.setMessage("请填写三次充值时间");
                return baseOutModel;
            }
        }
        Convert convert=new Convert();
        Student student = studentService.GetStudentByID(input.getStudentid());
        StudentRelation relation= studentRelationService.getRelationListByStudentidAndOpenid(input.getOpenid(),input.getStudentid());
        if(relation!=null)
        {
            appeal.setAppealresult("待审核");
            appeal.setStudentclass(student.getStudentclass());
            appeal.setRelation(relation.getRelation());
            appeal.setOpenid(input.getOpenid());
            appeal.setAppealtype(input.getAppealtype());
            appeal.setStudentname(student.getName());
            appeal.setPoarentname(relation.getParentname());
            appeal.setRelationid(relation.getId());
            appeal.setAmount1(input.getAmount1());
            appeal.setAmount2(input.getAmount2());
            appeal.setAmount3(input.getAmount3());
            appeal.setAppealtime(new Date());
            appeal.setRechargetime1(convert.StrToDate( input.getRechargetime1()));
            appeal.setRechargetime2(convert.StrToDate(input.getRechargetime2()));
            appeal.setRechargetime3(convert.StrToDate(input.getRechargetime3()));
            if (appealService.InsertAppeal(appeal))
            {
                baseOutModel.setMessage("申请成功");
                baseOutModel.setResult(1);
            } else
            {
                baseOutModel.setMessage("申请失败");
                baseOutModel.setResult(0);
            }
        }else
        {
            baseOutModel.setMessage("未找到绑定关系");
            baseOutModel.setResult(0);
        }

        return baseOutModel;
    }
    @ApiOperation("审核操作接口")
    @RequestMapping(value = "/appealresult/", method = RequestMethod.POST)
    public BaseOutModel appealresult(@RequestBody AppealResultInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();

        if (input.getAppealids().equals(""))
        {

            baseOutModel.setMessage("请输入id");
            baseOutModel.setResult(0);
        }
        String[] Arr = input.getAppealids().split(",");
        List<Long> ids = new ArrayList<>();
        for (String item : Arr)
        {
            ids.add(Long.valueOf(item));
        }

        List<Appeal> appealList = appealService.GetAppealByIDs(ids);
        if (appealList.size() > 0)
        {
            boolean falg = true;
            if (input.getAppealresult() .equals( "审核通过"))
            {
                for (Appeal appeal : appealList)
                {

                    StudentRelation ralation = studentRelationService.getStudetntRelationByID(appeal.getRelationid());
                    ralation.setMobilephone(appeal.getNewmobilephone());
                    falg = falg & studentRelationService.updateRelation(ralation) > 0;
                    if (falg)
                    {
                        appeal.setAppealresult(input.getAppealresult());
                        if (appealService.UpdateAppeal(appeal))
                        {
                            falg=falg&true;
                        }else
                        {
                            falg=falg&false;
                        }
                    }

                }
                if (falg)
                {
                    baseOutModel.setMessage("审核成功");
                    baseOutModel.setResult(1);
                } else
                {

                    baseOutModel.setMessage("审核失败");
                    baseOutModel.setResult(1);
                }

            } else
            {
                baseOutModel.setMessage("操作成功");
                baseOutModel.setResult(1);
            }
        } else
        {
            baseOutModel.setMessage("未找到相应的申诉");
            baseOutModel.setResult(0);
        }
        return baseOutModel;
    }
    @ApiOperation("审核列表")
    @RequestMapping(value = "/appeallist/", method = RequestMethod.POST)
    public BaseOutModel<AppealListOut> appeallist(@RequestBody AppealListInput input)
    {
        Convert convert=new Convert();
        BaseOutModel baseOutModel = new BaseOutModel();
        List<Appeal> list = appealService.GetAppealListByOpenId(input.getOpenid(),input.getAppealtype());

        //在线
        List<Appeal> onlinelist = appealService.GetAppealListByOpenId(input.getOpenid(), 1);
        //电话
        List<Appeal> Calllist = appealService.GetAppealListByOpenId(input.getOpenid(), 2);
        if (onlinelist.size() == 0 && Calllist.size() == 0)
        {

            AppealListOut out = new AppealListOut();
            if (onlinelist.size() > 0)
            {
                List<AppealListInfoOut> infoOuts = new ArrayList<>();
                for (Appeal item : onlinelist)
                {
                    StudentRelation relation= studentRelationService.getStudetntRelationByID(item.getRelationid());
                    Student student=studentService.GetStudentByID(relation.getStudentid());

                    AppealListInfoOut appealInfoOut = new AppealListInfoOut();
                    appealInfoOut.setAppealid(item.getId());
                    appealInfoOut.setName(item.getStudentname());
                    appealInfoOut.setAppwaltime(convert.DateToStr2(item.getAppealtime()));
                    appealInfoOut.setUserbh(student.getUsrbh());
                    infoOuts.add(appealInfoOut);
                }
                out.setOnlinelist(infoOuts);
            }
            if (Calllist.size() > 0)
            {
                List<AppealListInfoOut> infoOuts = new ArrayList<>();
                for (Appeal item : Calllist)
                {
                    StudentRelation relation= studentRelationService.getStudetntRelationByID(item.getRelationid());
                    Student student=studentService.GetStudentByID(relation.getStudentid());

                    AppealListInfoOut appealInfoOut = new AppealListInfoOut();
                    appealInfoOut.setAppealid(item.getId());
                    appealInfoOut.setName(item.getStudentname());
                    appealInfoOut.setAppwaltime(convert.DateToStr2(item.getAppealtime()));
                    appealInfoOut.setUserbh(student.getUsrbh());
                    infoOuts.add(appealInfoOut);
                }
                out.setCalllist(infoOuts);
            }
            baseOutModel.setData(out);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
        }else
        {
            baseOutModel.setResult(1);
            baseOutModel.setMessage("没有提交过申诉");
        }
        return baseOutModel;
    }
    @ApiOperation("审核列表")
    @RequestMapping(value = "/teacherappeallist/", method = RequestMethod.POST)
    public BaseOutModel<AppealListOut> teacherappeallist(@RequestBody TeacherAppealListInput input)
    {
        Convert convert=new Convert();
        BaseOutModel baseOutModel = new BaseOutModel();
        //在线
         List<Appeal> onlinelist = appealService.GetAppealListByStudentClass(input.getStudentclass(), 1);
        //电话
        List<Appeal> Calllist = appealService.GetAppealListByStudentClass(input.getStudentclass(), 2);
        if (onlinelist.size() != 0 || Calllist.size() != 0)
        {

            AppealListOut out = new AppealListOut();
            if (onlinelist.size() > 0)
            {
                List<AppealListInfoOut> infoOuts = new ArrayList<>();
                for (Appeal item : onlinelist)
                {
                   StudentRelation relation= studentRelationService.getStudetntRelationByID(item.getRelationid());
                   Student student=studentService.GetStudentByID(relation.getStudentid());

                    AppealListInfoOut appealInfoOut = new AppealListInfoOut();
                    appealInfoOut.setAppealid(item.getId());
                    appealInfoOut.setName(item.getStudentname());
                    appealInfoOut.setAppwaltime(convert.DateToStr2(item.getAppealtime()));
                    appealInfoOut.setUserbh(student.getUsrbh());
                    infoOuts.add(appealInfoOut);
                }
                out.setOnlinelist(infoOuts);
            }
            if (Calllist.size() > 0)
            {
                List<AppealListInfoOut> infoOuts = new ArrayList<>();
                for (Appeal item : Calllist)
                {
                    StudentRelation relation= studentRelationService.getStudetntRelationByID(item.getRelationid());
                    Student student=studentService.GetStudentByID(relation.getStudentid());

                    AppealListInfoOut appealInfoOut = new AppealListInfoOut();
                    appealInfoOut.setAppealid(item.getId());
                    appealInfoOut.setName(item.getStudentname());
                    appealInfoOut.setAppwaltime(convert.DateToStr2(item.getAppealtime()));
                    appealInfoOut.setUserbh(student.getUsrbh());
                    infoOuts.add(appealInfoOut);
                }
                out.setCalllist(infoOuts);
            }
            baseOutModel.setData(out);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
        } else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("没有提交过申诉");
        }
        return baseOutModel;
    }


    @ApiOperation("审核详情")
    @RequestMapping(value = "/getappealdetail/", method = RequestMethod.POST)
    public  BaseOutModel<AppealInfoOut> getappealdetail(@RequestBody GetAppealDetailInput input )
    {
        Convert convert = new Convert();
        BaseOutModel baseOutModel = new BaseOutModel();
        Appeal item = appealService.GetAppealById(input.getAppealid());
        if (item != null)
        {
            StudentRelation relation= studentRelationService.getStudetntRelationByID(item.getRelationid());
            Student student=studentService.GetStudentByID(relation.getStudentid());

            AppealInfoOut appealInfoOut = new AppealInfoOut();
            appealInfoOut.setUserbh(student.getUsrbh());
            appealInfoOut.setName(student.getName());
            appealInfoOut.setAmount1(item.getAmount1());
            appealInfoOut.setAmount2(item.getAmount2());
            appealInfoOut.setAmount3(item.getAmount3());
            appealInfoOut.setAppealtime(convert.DateToStr2(item.getAppealtime()));
            appealInfoOut.setAppealresult(item.getAppealresult());
            appealInfoOut.setRechargetime1(convert.DateToStr2(item.getRechargetime1()));
            appealInfoOut.setRechargetime2(convert.DateToStr2(item.getRechargetime2()));
            appealInfoOut.setRechargetime3(convert.DateToStr2(item.getRechargetime3()));
            baseOutModel.setData(appealInfoOut);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
            return baseOutModel;
        } else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("未找到详情");
            return baseOutModel;

        }
    }
}
