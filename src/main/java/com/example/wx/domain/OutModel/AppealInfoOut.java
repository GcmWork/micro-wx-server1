package com.example.wx.domain.OutModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealInfoOut
{
    private Long id;

    private Date appealtime;

    private Integer appealtype;

    private String oldmobilephone;

    private String newmobilephone;

    private String appealresult;

    private Date rechargetime1;

    private BigDecimal amount1;

    private Date rechargetime2;

    private BigDecimal amount2;

    private Date rechargetime3;

    private BigDecimal amount3;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }



    public Date getAppealtime()
    {
        return appealtime;
    }

    public void setAppealtime(Date appealtime)
    {
        this.appealtime = appealtime;
    }

    public Integer getAppealtype()
    {
        return appealtype;
    }

    public void setAppealtype(Integer appealtype)
    {
        this.appealtype = appealtype;
    }

    public String getOldmobilephone()
    {
        return oldmobilephone;
    }

    public void setOldmobilephone(String oldmobilephone)
    {
        this.oldmobilephone = oldmobilephone;
    }

    public String getNewmobilephone()
    {
        return newmobilephone;
    }

    public void setNewmobilephone(String newmobilephone)
    {
        this.newmobilephone = newmobilephone;
    }

    public String getAppealresult()
    {
        return appealresult;
    }

    public void setAppealresult(String appealresult)
    {
        this.appealresult = appealresult;
    }

    public Date getRechargetime1()
    {
        return rechargetime1;
    }

    public void setRechargetime1(Date rechargetime1)
    {
        this.rechargetime1 = rechargetime1;
    }

    public BigDecimal getAmount1()
    {
        return amount1;
    }

    public void setAmount1(BigDecimal amount1)
    {
        this.amount1 = amount1;
    }

    public Date getRechargetime2()
    {
        return rechargetime2;
    }

    public void setRechargetime2(Date rechargetime2)
    {
        this.rechargetime2 = rechargetime2;
    }

    public BigDecimal getAmount2()
    {
        return amount2;
    }

    public void setAmount2(BigDecimal amount2)
    {
        this.amount2 = amount2;
    }

    public Date getRechargetime3()
    {
        return rechargetime3;
    }

    public void setRechargetime3(Date rechargetime3)
    {
        this.rechargetime3 = rechargetime3;
    }

    public BigDecimal getAmount3()
    {
        return amount3;
    }

    public void setAmount3(BigDecimal amount3)
    {
        this.amount3 = amount3;
    }

}
