package com.example.wx.domain.OutModel;

import com.example.wx.model.Appeal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealListOut
{
    private List<Appeal> list=new ArrayList<>();

    public List<Appeal> getList()
    {
        return list;
    }

    public void setList(List<Appeal> list)
    {
        this.list = list;
    }
}
