package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/4/8.
 */
public class RechargeMoneyInput
{

    @ApiModelProperty("学号")
    private String userbh="";
    @ApiModelProperty("微信号")
    private String openid="";
    @ApiModelProperty("充值金额")
    private BigDecimal rechargeamount=BigDecimal.valueOf(0);
    @ApiModelProperty("充值状态 充值成功or充值失败")
    private String rechargestatus;



    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getRechargestatus()
    {
        return rechargestatus;
    }

    public void setRechargestatus(String rechargestatus)
    {
        this.rechargestatus = rechargestatus;
    }

    public BigDecimal getRechargeamount()
    {
        return rechargeamount;
    }

    public void setRechargeamount(BigDecimal rechargeamount)
    {
        this.rechargeamount = rechargeamount;
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
