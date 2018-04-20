package com.example.wx.domain.OutModel;

/**
 * Created by Administrator on 2018/3/30.
 */
public class SendSmsResult
{
    private Integer result=0;
    private String errmsg="";
    private String ext="";
    private Integer fee=0;
    private String sid="";

    public Integer getResult()
    {
        return result;
    }

    public void setResult(Integer result)
    {
        this.result = result;
    }

    public String getErrmsg()
    {
        return errmsg;
    }

    public void setErrmsg(String errmsg)
    {
        this.errmsg = errmsg;
    }

    public String getExt()
    {
        return ext;
    }

    public void setExt(String ext)
    {
        this.ext = ext;
    }

    public Integer getFee()
    {
        return fee;
    }

    public void setFee(Integer fee)
    {
        this.fee = fee;
    }

    public String getSid()
    {
        return sid;
    }

    public void setSid(String sid)
    {
        this.sid = sid;
    }
}
