package com.example.wx.domain.OutModel;

/**
 * Created by Administrator on 2018/4/21.
 */
public class AppealListInfoOut
{

    public  String name;
    public String userbh;
    public  String appwaltime;
    public  Long appealid;

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

    public String getAppwaltime()
    {
        return appwaltime;
    }

    public void setAppwaltime(String appwaltime)
    {
        this.appwaltime = appwaltime;
    }

    public Long getAppealid()
    {
        return appealid;
    }

    public void setAppealid(Long appealid)
    {
        this.appealid = appealid;
    }
}
