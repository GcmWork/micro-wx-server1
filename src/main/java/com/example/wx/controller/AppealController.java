package com.example.wx.controller;

import com.example.wx.domain.InputModel.AppealListInput;
import com.example.wx.domain.InputModel.AppealResultInput;
import com.example.wx.domain.InputModel.SubmitAppealInput;
import com.example.wx.domain.OutModel.AppealListOut;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.SubmitAppealOut;
import com.example.wx.model.Appeal;
import com.example.wx.model.Student;
import com.example.wx.model.StudentRelation;
import com.example.wx.service.AppealService;
import com.example.wx.service.StudentRelationService;
import com.example.wx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */

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
        if (input.getOldmobilephone().equals(""))
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
        Student student = studentService.GetStudentByID(input.getStudentid());
        StudentRelation relation= studentRelationService.getRelationListByStudentidAndOpenid(input.getOpenid(),input.getStudentid());
        if(relation!=null)
        {
            appeal.setRelation(input.getRelation());
            appeal.setOpenid(input.getOpenid());
            appeal.setAppealtype(input.getAppealtype());
            appeal.setStudentname(student.getName());
            appeal.setRelationid(relation.getId());
            appeal.setAmount1(input.getAmount1());
            appeal.setAmount2(input.getAmount2());
            appeal.setAmount3(input.getAmount3());
            appeal.setAppealtime(new Date());
            appeal.setRechargetime1(input.getRechargetime1());
            appeal.setRechargetime2(input.getRechargetime2());
            appeal.setRechargetime3(input.getRechargetime3());
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

    @RequestMapping(value = "/appealresult/", method = RequestMethod.POST)
    public BaseOutModel appealresult(@RequestBody AppealResultInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();
        Appeal appeal = appealService.GetAppealById(input.getAppealid());
        if (appeal != null)
        {
            appeal.setAppealresult(input.getAppealresult());
            if (appealService.UpdateAppeal(appeal))
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
            baseOutModel.setMessage("未找到相应的申诉");
            baseOutModel.setResult(0);
        }
        return baseOutModel;
    }

    @RequestMapping(value = "/appeallist/", method = RequestMethod.POST)
    public BaseOutModel<AppealListOut> appeallist(@RequestBody AppealListInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();
        List<Appeal> list = appealService.GetAppealListByOpenId(input.getOpenid(),input.getAppealtype());
        if(list.size()>0)
        {
            AppealListOut out=new AppealListOut();
            out.setList(list);
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
}
