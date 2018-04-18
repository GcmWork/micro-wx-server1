package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
public class SpendListOut
{
    public List<SpendInfoOut> list =new ArrayList<>();

    public List<SpendInfoOut> getList()
    {
        return list;
    }

    public void setList(List<SpendInfoOut> list)
    {
        this.list = list;
    }
}
