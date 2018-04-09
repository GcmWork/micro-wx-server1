package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/4/2.
 */
public class ValidateMobileCodeInput
{
    @ApiModelProperty("手机号")
    private  String mobilephone="";

    @ApiModelProperty("验证码")
    private String verificationcode="";

    public String getMobilephone()
    {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone)
    {
        this.mobilephone = mobilephone;
    }

    public String getVerificationcode()
    {
        return verificationcode;
    }

    public void setVerificationcode(String verificationcode)
    {
        this.verificationcode = verificationcode;
    }
}
