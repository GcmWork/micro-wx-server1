package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/4/8.
 */
public class GetStudentInfoInput
{
    @ApiModelProperty("学号")
    private  String userbh="";

    public String getUserbh()
    {
        return userbh;
    }

    public void setUserbh(String userbh)
    {
        this.userbh = userbh;
    }
}
