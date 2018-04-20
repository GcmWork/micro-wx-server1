package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealListOut
{
    private List<AppealInfoOut> list=new ArrayList<>();

    public List<AppealInfoOut> getList()
    {
        return list;
    }

    public void setList(List<AppealInfoOut> list)
    {
        this.list = list;
    }
}
