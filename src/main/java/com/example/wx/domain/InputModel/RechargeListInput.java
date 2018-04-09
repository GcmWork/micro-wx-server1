package com.example.wx.domain.InputModel;

/**
 * Created by Administrator on 2018/4/9.
 */
public class RechargeListInput
{
    private String starttime="";
    private String endtime="";
    private String openid="";
    private long relationid=0l;

    public String getStarttime()
    {
        return starttime;
    }

    public void setStarttime(String starttime)
    {
        this.starttime = starttime;
    }

    public String getEndtime()
    {
        return endtime;
    }

    public void setEndtime(String endtime)
    {
        this.endtime = endtime;
    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public long getRelationid()
    {
        return relationid;
    }

    public void setRelationid(long relationid)
    {
        this.relationid = relationid;
    }
}
