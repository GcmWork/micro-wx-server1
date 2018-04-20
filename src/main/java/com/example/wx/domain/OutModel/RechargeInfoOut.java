package com.example.wx.domain.OutModel;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/4/9.
 */
public class RechargeInfoOut
{
    private String openid;

    private String mobilephone;

    private BigDecimal rechargeamount;

    private String rechargedate;

    private String rechargestatus;

    private String userbh;

    private String studentname;

    private String parentname;

    private String addfield;

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getMobilephone()
    {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone)
    {
        this.mobilephone = mobilephone;
    }

    public BigDecimal getRechargeamount()
    {
        return rechargeamount;
    }

    public void setRechargeamount(BigDecimal rechargeamount)
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

    public String getUserbh()
    {
        return userbh;
    }

    public void setUserbh(String userbh)
    {
        this.userbh = userbh;
    }

    public String getStudentname()
    {
        return studentname;
    }

    public void setStudentname(String studentname)
    {
        this.studentname = studentname;
    }

    public String getParentname()
    {
        return parentname;
    }

    public void setParentname(String parentname)
    {
        this.parentname = parentname;
    }

    public String getAddfield()
    {
        return addfield;
    }

    public void setAddfield(String addfield)
    {
        this.addfield = addfield;
    }

    public String getRechargedate()
    {
        return rechargedate;
    }

    public void setRechargedate(String rechargedate)
    {
        this.rechargedate = rechargedate;
    }
}
