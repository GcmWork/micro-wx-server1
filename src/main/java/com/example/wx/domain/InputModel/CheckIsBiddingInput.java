package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class CheckIsBiddingInput
{
    @ApiModelProperty("微信号")
    private String openid="";

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }
}
