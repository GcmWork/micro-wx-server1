package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/22.
 */
public class ValidateStudentInput
{
    @ApiModelProperty("学号")
    public String userbh="";
    @ApiModelProperty("学生姓名")
    public String name="";
    @ApiModelProperty("学生班级")
    public String studentclass="";
    @ApiModelProperty("微信号")
    public String openid="";
    @ApiModelProperty("验证类型 1 验证是否由此学生 2验证绑定情况验证此项需要有手机号")
    public Integer validatetype=0;



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getStudentclass()
    {
        return studentclass;
    }

    public void setStudentclass(String studentclass)
    {
        this.studentclass = studentclass;
    }

    public Integer getValidatetype()
    {
        return validatetype;
    }

    public void setValidatetype(Integer validatetype)
    {
        this.validatetype = validatetype;
    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getUserbh()
    {
        return userbh;
    }

    public void setUserbh(String userbh)
    {
        this.userbh = userbh;
    }
}
