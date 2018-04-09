package com.example.wx.controller;

import com.example.wx.domain.InputModel.TestInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.model.Student;
import com.example.wx.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.example.wx.sevice.StudentService;

/**
 * Created by Administrator on 2018/3/14.
 */
@Api(description="测试")
@RestController
@RequestMapping("/index/")
public class IndexController
{
@Autowired
StudentService studentService;
    Logger logger = LoggerFactory.getLogger(IndexController.class);
    @GetMapping("HolleWord/")
    @ApiOperation("HolleWord")
    public String HolleWord(@RequestParam  String name,String cityname)
    {
try
{
     name = java.net.URLEncoder.encode(name, "GBK");
    cityname = java.net.URLEncoder.encode(cityname, "GBK");

    return  "name："+name +";cityname="+cityname;
}catch (Exception e)
{

    return  "30001："+name;
}
    }
    @ApiOperation("test")
    @RequestMapping(value = "/test/",method = RequestMethod.POST)
    public BaseOutModel test(@RequestBody TestInput input)
    {
        BaseOutModel outModel=new BaseOutModel();
        logger.info(input.getName()+"年龄是"+input.getAge());
        outModel.setMessage("操作正确de");
        outModel.setResult(1);
        outModel.setData(12);
        return  outModel;
    }
    @ApiOperation("noparamtest")
    @RequestMapping(value = "/noparamtest/",method = RequestMethod.POST)
    public BaseOutModel noparamtest()
    {
        BaseOutModel outModel=new BaseOutModel();
       Student student= null;
        logger.info("年龄");
        outModel.setMessage("操作正确");
        outModel.setResult(1);
        outModel.setData(student);
        return  outModel;
    }

}
