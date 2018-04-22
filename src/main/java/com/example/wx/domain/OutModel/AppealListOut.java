package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealListOut
{
    private List<AppealListInfoOut> onlinelist=new ArrayList<>();
    private List<AppealListInfoOut> calllist=new ArrayList<>();

    public List<AppealListInfoOut> getOnlinelist()
    {
        return onlinelist;
    }

    public void setOnlinelist(List<AppealListInfoOut> onlinelist)
    {
        this.onlinelist = onlinelist;
    }

    public List<AppealListInfoOut> getCalllist()
    {
        return calllist;
    }

    public void setCalllist(List<AppealListInfoOut> calllist)
    {
        this.calllist = calllist;
    }
}
