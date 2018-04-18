package com.example.wx.domain.InputModel;

/**
 * Created by Administrator on 2018/4/16.
 */
public class InandoutschoolListInput
{
    private String starttime="";
    private String endtime="";
    private String userbh="";

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



    public String getUserbh()
    {
        return userbh;
    }

    public void setUserbh(String userbh)
    {
        this.userbh = userbh;
    }
}
