package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealListOut
{
    private List<AppealInfoOut> onlinelist=new ArrayList<>();
    private List<AppealInfoOut> calllist=new ArrayList<>();

    public List<AppealInfoOut> getOnlinelist()
    {
        return onlinelist;
    }

    public void setOnlinelist(List<AppealInfoOut> onlinelist)
    {
        this.onlinelist = onlinelist;
    }

    public List<AppealInfoOut> getCalllist()
    {
        return calllist;
    }

    public void setCalllist(List<AppealInfoOut> calllist)
    {
        this.calllist = calllist;
    }
}
