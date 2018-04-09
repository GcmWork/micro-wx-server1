package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class UnbindReasonListOut
{
    private List<UnbindReasonInfoOut> list=new ArrayList<>();

    public List<UnbindReasonInfoOut> getList()
    {
        return list;
    }

    public void setList(List<UnbindReasonInfoOut> list)
    {
        this.list = list;
    }
}
