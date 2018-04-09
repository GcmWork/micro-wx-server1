package com.example.wx.controller;

import com.example.wx.domain.InputModel.*;
import com.example.wx.domain.OutModel.*;
import com.example.wx.model.Student;
import com.example.wx.model.StudentRelation;
import com.example.wx.service.StudentRelationService;
import com.example.wx.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */

@Api(description="绑定相关接口")
@RestController
@RequestMapping("/binding/")
public class BindingController
{
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRelationService studentRelationService;
    @Autowired
    StudentController studentController;
    @Autowired
    SmsController smsController;
    @ApiOperation("绑定接口")
    @RequestMapping(value = "biddingstudent", method = RequestMethod.POST)
    public BaseOutModel<BiddingStudentOut> biddingstudent(@RequestBody BiddingStudentInput input)
    {
        BiddingStudentOut biddingStudentOut = new BiddingStudentOut();
        BaseOutModel baseOutModel = new BaseOutModel();
        ValidateStudentInput validateStudentInput = new ValidateStudentInput();
        validateStudentInput.setName(input.getName());
        validateStudentInput.setOpenid(input.getOpenid());
        validateStudentInput.setStudentclass(input.getStudentclass());
        validateStudentInput.setValidatetype(2);
        BaseOutModel<ValidateStudentOut> validateOut = studentController.validatestudent(validateStudentInput);
        if (validateOut.getData().getCode() != "00")
        {
            biddingStudentOut.setCode(validateOut.getData().getCode());
            biddingStudentOut.setReason(validateOut.getData().getReason());
            baseOutModel.setData(biddingStudentOut);
            return baseOutModel;
        }

        Student student = studentService.GetStudentByUserbh(input.getUserbh(), input.getName(), input.getStudentclass());
        StudentRelation relation = new StudentRelation();
        relation.setStatus(1);
        relation.setMobilephone(input.getMobilephone());
        relation.setStudentid(student.getId());
        relation.setOpenid(input.getOpenid());
        relation.setParentname(input.getParentname());
        relation.setRelation(input.getRelation());
        Integer id = studentRelationService.InsertRelation(relation);
        if (id > 0)
        {
            biddingStudentOut.setCode("00");
            biddingStudentOut.setReason("绑定成功");
            baseOutModel.setData(biddingStudentOut);
            return baseOutModel;
        } else
        {
            biddingStudentOut.setCode("05");
            biddingStudentOut.setReason("绑定失败");
            baseOutModel.setData(biddingStudentOut);
            return baseOutModel;
        }
    }
    @ApiOperation("检测是否符合绑定条件")
    @RequestMapping(value = "checkisbidding", method = RequestMethod.POST)
    public BaseOutModel<CheckIsBiddingOut> checkisbidding(@RequestBody CheckIsBiddingInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
        CheckIsBiddingOut checkIsBiddingOut=new CheckIsBiddingOut();
       Long count= studentRelationService.getCountByOpenid(input.getOpenid());
       if(count<=0)
       {
           checkIsBiddingOut.setIsbidding(0);
           baseOutModel.setResult(1);
           baseOutModel.setMessage("查询成功");
           baseOutModel.setData(checkIsBiddingOut);
            return  baseOutModel;
       }else
       {
           List<StudentRelation> list=studentRelationService.getRelationListByOpenid(input.getOpenid());
           //取最后绑定学生
           StudentRelation studentRelation= list.get(0);
           Student student=studentService.GetStudentByID(studentRelation.getId());
          long studentid= studentRelation.getStudentid();
           checkIsBiddingOut.setIsbidding(1);
           checkIsBiddingOut.setUserbh(student.getUsrbh());
           checkIsBiddingOut.setName(student.getName());
           checkIsBiddingOut.setStudentclass(student.getStudentclass());
           checkIsBiddingOut.setOpenid(studentRelation.getOpenid());
           checkIsBiddingOut.setRelation(studentRelation.getRelation());
           checkIsBiddingOut.setMobilephone(studentRelation.getMobilephone());
           checkIsBiddingOut.setParentname(studentRelation.getParentname());
           baseOutModel.setResult(1);
           baseOutModel.setData(checkIsBiddingOut);
           baseOutModel.setMessage("查询成功");
           return  baseOutModel;
       }
    }
    @ApiOperation("绑定列表")
    @RequestMapping(value = "biddinglist", method = RequestMethod.POST)
    public BaseOutModel<BiddingListOut> biddinglist(@RequestBody BiddingListInput input)
    {
        List<BiddingInfoOut> biddingListOut = new ArrayList<>();
        BaseOutModel baseOutModel = new BaseOutModel();
        List<StudentRelation> list = studentRelationService.getRelationListByOpenid(input.getOpenid());
        if (list.size() > 0)
        {
            for (StudentRelation item : list)
            {
                Student student = studentService.GetStudentByID(item.getId());
                BiddingInfoOut biddingInfoOut = new BiddingInfoOut();
                biddingInfoOut.setName(student.getName());
                biddingInfoOut.setUsebh(student.getUsrbh());
                biddingInfoOut.setStudentid(item.getStudentid());
                biddingListOut.add(biddingInfoOut);
            }
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
            baseOutModel.setData(biddingListOut);
        } else
        {
            baseOutModel.setResult(1);
            baseOutModel.setMessage("未绑定学生");
        }
        return baseOutModel;
    }
    @ApiOperation("绑定信息")
    @RequestMapping(value = "getbidinginfo", method = RequestMethod.POST)
    public BaseOutModel<GetBidingInfoOut> getbidinginfo(@RequestBody BiddingListInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();
        StudentRelation studentRelation = studentRelationService.getRelationListByStudentidAndOpenid(input.getOpenid(), input.getStudentid());
        if (studentRelation != null)
        {
            Student student = studentService.GetStudentByID(studentRelation.getStudentid());
            GetBidingInfoOut getBidingInfoOut = new GetBidingInfoOut();
            getBidingInfoOut.setName(student.getName());
            getBidingInfoOut.setUserbh(student.getUsrbh());
            getBidingInfoOut.setMobilephone(studentRelation.getMobilephone());
            getBidingInfoOut.setParentname(studentRelation.getParentname());
            getBidingInfoOut.setStudentclass(student.getStudentclass());
            getBidingInfoOut.setRelation(studentRelation.getRelation());
            baseOutModel.setData(getBidingInfoOut);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
        } else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("查询失败，此账号未绑定此学生");
        }
        return baseOutModel;
    }
    @ApiOperation("取消绑定")
    @RequestMapping(value = "unbind", method = RequestMethod.POST)
    public BaseOutModel unbind(@RequestBody UnbindInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();


        StudentRelation studentRelation = studentRelationService.getRelationListByUnbindInput(input);
        if (studentRelation != null)
        {
            ValidateMobileCodeInput va=new ValidateMobileCodeInput();
            va.setMobilephone(input.getMobilephone());
            va.setVerificationcode(input.getVerificationcode());
            baseOutModel =smsController.validatemobilecode(va);
            if(baseOutModel.getResult().equals(0))
            {
                baseOutModel.setMessage("手机号验证码错误");
                return baseOutModel;
            }
            studentRelation.setNobindreason(input.getNobindreason());
            studentRelation.setNobindtime(new Date());
            studentRelation.setStatus(0);
            Integer count = studentRelationService.updateRelation(studentRelation);
            if (count > 0)
            {
                baseOutModel.setResult(1);
                baseOutModel.setMessage("取消绑定成功");
            }
        } else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("查询失败，此账号未绑定此学生无需解绑");
        }
        return baseOutModel;
    }
    @ApiOperation("修改绑定手机号")
    @RequestMapping(value = "changebind", method = RequestMethod.POST)
    public BaseOutModel changebind(@RequestBody ChangeBindInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
        StudentRelation studentRelation = studentRelationService.getRelationListByStudentidAndOpenid(input.getOpenid(), input.getStudentid());
        if (studentRelation != null)
        {

            ValidateMobileCodeInput old=new ValidateMobileCodeInput();
            old.setMobilephone(input.getOldmobilephone());
            old.setVerificationcode(input.getOldverificationcode());
           baseOutModel =smsController.validatemobilecode(old);
           if(baseOutModel.getResult().equals(0))
           {
               baseOutModel.setMessage("旧手机号验证码错误");
               return baseOutModel;
           }
            ValidateMobileCodeInput n=new ValidateMobileCodeInput();
            n.setMobilephone(input.getNewmobilephone());
            n.setVerificationcode(input.getNewverificationcode());
            baseOutModel =smsController.validatemobilecode(n);
            if(baseOutModel.getResult().equals(0))
            {
                baseOutModel.setMessage("新手机号验证码错误");
                return baseOutModel;
            }
            studentRelation.setMobilephone(input.getNewmobilephone());
            Integer count= studentRelationService.updateRelation(studentRelation);
            if(count>0)
            {
                baseOutModel.setResult(1);
                baseOutModel.setMessage("换绑成功");
            }
        }else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("查询失败，此账号或手机号未绑定此学生无需解绑");
        }

        return baseOutModel;
    }
}
