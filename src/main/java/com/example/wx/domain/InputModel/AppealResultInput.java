package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealResultInput
{
    @ApiModelProperty("申诉id")
    private Long appealid=0L;
    @ApiModelProperty("申诉结果 申诉通过或 申诉拒绝")
    private String appealresult="";


    public String getAppealresult()
    {
        return appealresult;
    }

    public void setAppealresult(String appealresult)
    {
        this.appealresult = appealresult;
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
