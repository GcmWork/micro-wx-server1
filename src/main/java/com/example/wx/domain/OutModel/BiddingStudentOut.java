package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/28.
 */
public class BiddingStudentOut
{
    @ApiModelProperty("验证不通过的原因")
    private String reason="";
    @ApiModelProperty("验证码 00信息正确并可以绑定 01 学生信息有误 02该学生已绑定3个手机号不可再绑定 03该微信号已绑定3个学生不可再绑定 04该微信已绑定过此学生不可重复绑定 05绑定失败")
    private String code="00";

    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }
}
