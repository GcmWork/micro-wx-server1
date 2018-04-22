package com.example.wx.domain.OutModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
public class SpendListOut
{
    public List<SpendInfoOut> list =new ArrayList<>();
    public BigDecimal spendtotalamount=BigDecimal.valueOf(0);

    public List<SpendInfoOut> getList()
    {
        return list;
    }

    public void setList(List<SpendInfoOut> list)
    {
        this.list = list;
    }

    public BigDecimal getSpendtotalamount()
    {
        return spendtotalamount;
    }

    public void setSpendtotalamount(BigDecimal spendtotalamount)
    {
        this.spendtotalamount = spendtotalamount;
    }
}
