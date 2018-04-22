package com.example.wx.domain.OutModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealInfoOut
{

    public  String name;
    public String userbh;
    private String appealtime;

    private String appealresult;

    private String rechargetime1;

    private BigDecimal amount1;

    private String rechargetime2;

    private BigDecimal amount2;

    private String rechargetime3;

    private BigDecimal amount3;

    public String getAppealresult()
    {
        return appealresult;
    }

    public void setAppealresult(String appealresult)
    {
        this.appealresult = appealresult;
    }

    public BigDecimal getAmount1()
    {
        return amount1;
    }

    public void setAmount1(BigDecimal amount1)
    {
        this.amount1 = amount1;
    }


    public BigDecimal getAmount2()
    {
        return amount2;
    }

    public void setAmount2(BigDecimal amount2)
    {
        this.amount2 = amount2;
    }


    public BigDecimal getAmount3()
    {
        return amount3;
    }

    public void setAmount3(BigDecimal amount3)
    {
        this.amount3 = amount3;
    }

    public String getRechargetime1()
    {
        return rechargetime1;
    }

    public void setRechargetime1(String rechargetime1)
    {
        this.rechargetime1 = rechargetime1;
    }

    public String getRechargetime2()
    {
        return rechargetime2;
    }

    public void setRechargetime2(String rechargetime2)
    {
        this.rechargetime2 = rechargetime2;
    }

    public String getRechargetime3()
    {
        return rechargetime3;
    }

    public void setRechargetime3(String rechargetime3)
    {
        this.rechargetime3 = rechargetime3;
    }

    public String getAppealtime()
    {
        return appealtime;
    }

    public void setAppealtime(String appealtime)
    {
        this.appealtime = appealtime;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
