package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class AppealListInput
{
    @ApiModelProperty("审核人微信号")
    private String openid="";
    @ApiModelProperty("申诉类型")
    private Integer appealtype=0;

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public Integer getAppealtype()
    {
        return appealtype;
    }

    public void setAppealtype(Integer appealtype)
    {
        this.appealtype = appealtype;
    }
}
