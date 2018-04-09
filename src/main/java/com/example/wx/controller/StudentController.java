package com.example.wx.controller;

import com.example.wx.domain.InputModel.GetStudentInfoInput;
import com.example.wx.domain.InputModel.ValidateStudentInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.GetStudentOut;
import com.example.wx.domain.OutModel.ValidateStudentOut;
import com.example.wx.model.Student;
import com.example.wx.service.StudentRelationService;
import com.example.wx.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/22.
 */

@Api(description="学生信息相关接口")
@RestController
@RequestMapping("/student/")
public class StudentController
{
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRelationService studentRelationService;
    @ApiOperation("校验是否有该学生")
    @RequestMapping(value = "/validatestudent",method = RequestMethod.POST)
    public BaseOutModel<ValidateStudentOut> validatestudent(@RequestBody ValidateStudentInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
        ValidateStudentOut out=new ValidateStudentOut();
        //首先判断是否有改学生
        Student student= studentService.GetStudentByUserbh(input.getUserbh(),input.getName(),input.getStudentclass());
        if(student==null)
        {
            out.setReason("学生信息有误,请核实");
            out.setCode("01");
            baseOutModel.setData(out);
            baseOutModel.setResult(0);
            return baseOutModel;
        }
        if(input.getValidatetype()==1)
        {
            out.setReason("学生信息正确");
            out.setCode("00");
            baseOutModel.setData(out);
            baseOutModel.setResult(1);
            return baseOutModel;
        }
        //查找此学生已绑定几个手机号
        long count1= studentRelationService.getCountByStudentid(student.getId());
        if(count1>=3)
        {
            out.setReason("该学生已绑定3个手机号不可再绑定");
            out.setCode("02");
            baseOutModel.setData(out);
            baseOutModel.setResult(0);
            return baseOutModel;
        }
        //查找微信号已绑定几个学生
        long count2= studentRelationService.getCountByOpenid(input.getOpenid());
        if(count1>=3)
        {
            out.setReason("该微信号已绑定3个学生不可再绑定");
            out.setCode("03");
            baseOutModel.setData(out);
            baseOutModel.setResult(0);
            return baseOutModel;
        }
        //查找此手机号是否已绑定过此学生
        long count3= studentRelationService.getCountByOpenidandStudentId(input.getOpenid(),student.getId());
        if(count1>=1)
        {
            out.setReason("该微信已绑定过此学生不可重复绑定");
            out.setCode("04");
            baseOutModel.setData(out);
            baseOutModel.setResult(0);
            return baseOutModel;
        }
        out.setReason("验证通过");
        out.setCode("00");
        baseOutModel.setData(out);
        baseOutModel.setResult(1);
        return baseOutModel;
    }
    @ApiOperation("获取学生信息")
    @RequestMapping(value = "/getstudentinfo",method = RequestMethod.POST)
    public BaseOutModel<GetStudentOut> getstudentinfo(@RequestBody GetStudentInfoInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
       Student student= studentService.GetStudentByUserbh(input.getUserbh(),"","");
       if(student==null)
       {
           baseOutModel.setMessage("学号错误未查到学生信息");
           baseOutModel.setResult(0);
           return baseOutModel;
       }
       GetStudentOut out=new GetStudentOut();
       out.setStudentclass(student.getStudentclass());
       out.setAge(student.getAge());
       out.setEtm(student.getEtm());
       out.setId(student.getId());
       out.setName(student.getName());
       out.setOpenid(student.getOpenid());
       out.setSex(student.getSex());
       out.setStm(student.getStm());
       out.setUsrbh(student.getUsrbh());
       baseOutModel.setMessage("查询成功");
       baseOutModel.setResult(1);
       baseOutModel.setData(out);
       return baseOutModel;
    }

}
