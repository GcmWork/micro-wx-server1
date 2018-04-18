package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/4/8.
 */
public class ChangeBindInput
{
    @ApiModelProperty("学生id")
    public Long studentid=0l;
//    @ApiModelProperty("学号")
//    public String userbh="";
    @ApiModelProperty("微信号")
    private String openid="";
    @ApiModelProperty("新手机号")
    private String newmobilephone="";
//    @ApiModelProperty("旧手机号")
//    private String oldmobilephone="";
//    @ApiModelProperty("旧手机号验证码")
//    private String oldverificationcode="";
//    @ApiModelProperty("新手机号")
//    private String newverificationcode="";

    public Long getStudentid()
    {
        return studentid;
    }

    public void setStudentid(Long studentid)
    {
        this.studentid = studentid;
    }

//    public String getUserbh()
//    {
//        return userbh;
//    }
//
//    public void setUserbh(String userbh)
//    {
//        this.userbh = userbh;
//    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getNewmobilephone()
    {
        return newmobilephone;
    }

    public void setNewmobilephone(String newmobilephone)
    {
        this.newmobilephone = newmobilephone;
    }

//    public String getOldmobilephone()
//    {
//        return oldmobilephone;
//    }
//
//    public void setOldmobilephone(String oldmobilephone)
//    {
//        this.oldmobilephone = oldmobilephone;
//    }
//
//    public String getOldverificationcode()
//    {
//        return oldverificationcode;
//    }
//
//    public void setOldverificationcode(String oldverificationcode)
//    {
//        this.oldverificationcode = oldverificationcode;
//    }
//
//    public String getNewverificationcode()
//    {
//        return newverificationcode;
//    }
//
//    public void setNewverificationcode(String newverificationcode)
//    {
//        this.newverificationcode = newverificationcode;
//    }
}
