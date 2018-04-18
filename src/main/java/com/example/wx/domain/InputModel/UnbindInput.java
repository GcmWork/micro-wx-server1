package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class UnbindInput
{

    @ApiModelProperty("学生id")
    public Long studentid=0L;

    @ApiModelProperty("微信号")
    private String openid="";
//    @ApiModelProperty("电话")
//    private String mobilephone="";
//    @ApiModelProperty("验证码")
//    private String verificationcode="";
    @ApiModelProperty("解绑原因")
    private String nobindreason="";

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }


//    public String getMobilephone()
//    {
//        return mobilephone;
//    }
//
//    public void setMobilephone(String mobilephone)
//    {
//        this.mobilephone = mobilephone;
//    }



    public Long getStudentid()
    {
        return studentid;
    }

    public void setStudentid(Long studentid)
    {
        this.studentid = studentid;
    }

    public String getNobindreason()
    {
        return nobindreason;
    }

    public void setNobindreason(String nobindreason)
    {
        this.nobindreason = nobindreason;
    }

//    public String getVerificationcode()
//    {
//        return verificationcode;
//    }
//
//    public void setVerificationcode(String verificationcode)
//    {
//        this.verificationcode = verificationcode;
//    }
}
