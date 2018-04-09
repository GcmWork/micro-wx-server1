package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/4/8.
 */
public class RechargeMoneyInput
{

    @ApiModelProperty("电话")
    private String mobilephone="";
    @ApiModelProperty("验证码")
    private String verificationcode="";
    @ApiModelProperty("微信号")
    private String openid;
    @ApiModelProperty("充值金额")
    private Long rechargeamount;
    @ApiModelProperty("充值状态 充值成功or充值失败")
    private String rechargestatus;
    @ApiModelProperty("学生关系id")
    private Long relationid;
    @ApiModelProperty("备注")
    private String addfield;

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

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public Long getRechargeamount()
    {
        return rechargeamount;
    }

    public void setRechargeamount(Long rechargeamount)
    {
        this.rechargeamount = rechargeamount;
    }

    public String getRechargestatus()
    {
        return rechargestatus;
    }

    public void setRechargestatus(String rechargestatus)
    {
        this.rechargestatus = rechargestatus;
    }

    public Long getRelationid()
    {
        return relationid;
    }

    public void setRelationid(Long relationid)
    {
        this.relationid = relationid;
    }

    public String getAddfield()
    {
        return addfield;
    }

    public void setAddfield(String addfield)
    {
        this.addfield = addfield;
    }
}
