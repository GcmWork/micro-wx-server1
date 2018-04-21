package com.example.wx.controller;

import com.example.wx.domain.InputModel.GetTeacherInfoInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.TeacherInfoOut;
import com.example.wx.model.Teacher;
import com.example.wx.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/21.
 */

@Api(description="教师信息相关接口")
@RestController
@RequestMapping("/teacher/")
public class TeacherController
{
    @Autowired
    TeacherService teacherService;
    @ApiOperation("教师登录接口")
    @RequestMapping(value = "/getteacherinfo",method = RequestMethod.POST)
    public BaseOutModel getTeacherInfo(@RequestBody GetTeacherInfoInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
        Teacher teacher=teacherService.GetTeacherInfoByUserName(input);
        if (teacher!=null)
        {
            TeacherInfoOut out=new TeacherInfoOut();
           out.setStudentcalss(teacher.getStudentclass());
           out.setUsername(teacher.getUsername());
            baseOutModel.setData(out);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
        }else
        {

            baseOutModel.setResult(0);
            baseOutModel.setMessage("教师身份验证失败");
        }
        return  baseOutModel;
    }
}
