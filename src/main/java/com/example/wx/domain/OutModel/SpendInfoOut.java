package com.example.wx.domain.OutModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/16.
 */
public class SpendInfoOut
{
    private String spendtype;

    private String spendtime;

    private BigDecimal beforeamount;

    private BigDecimal amount;

    private BigDecimal afteramount;


    public String getSpendtype()
    {
        return spendtype;
    }

    public void setSpendtype(String spendtype)
    {
        this.spendtype = spendtype;
    }


    public BigDecimal getBeforeamount()
    {
        return beforeamount;
    }

    public void setBeforeamount(BigDecimal beforeamount)
    {
        this.beforeamount = beforeamount;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getAfteramount()
    {
        return afteramount;
    }

    public void setAfteramount(BigDecimal afteramount)
    {
        this.afteramount = afteramount;
    }


    public String getSpendtime()
    {
        return spendtime;
    }

    public void setSpendtime(String spendtime)
    {
        this.spendtime = spendtime;
    }
}
