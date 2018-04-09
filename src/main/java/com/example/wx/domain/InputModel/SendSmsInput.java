package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/30.
 */
public class SendSmsInput
{
    @ApiModelProperty("手机号")
    private String mobile="";
    @ApiModelProperty("0 绑定解绑验证码短信 1其他短信")
    private  Integer smstype=0;

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public Integer getSmstype()
    {
        return smstype;
    }

    public void setSmstype(Integer smstype)
    {
        this.smstype = smstype;
    }
}
