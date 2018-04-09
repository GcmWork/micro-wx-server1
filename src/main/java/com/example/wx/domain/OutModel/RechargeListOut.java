package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/9.
 */
public class RechargeListOut
{
    private List<RechargeInfoOut> list=new ArrayList<>();

    public List<RechargeInfoOut> getList()
    {
        return list;
    }

    public void setList(List<RechargeInfoOut> list)
    {
        this.list = list;
    }
}
