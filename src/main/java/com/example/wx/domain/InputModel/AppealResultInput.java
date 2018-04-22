package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealResultInput
{
    @ApiModelProperty("申诉id 批量操作，用英文逗号分隔")
    private String  appealids="";
    @ApiModelProperty("申诉结果 申诉通过 或 申诉拒绝")
    private String appealresult="";


    public String getAppealresult()
    {
        return appealresult;
    }

    public void setAppealresult(String appealresult)
    {
        this.appealresult = appealresult;
    }

    public String getAppealids()
    {
        return appealids;
    }

    public void setAppealids(String appealids)
    {
        this.appealids = appealids;
    }
}
