package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class BiddingListInput
{
    @ApiModelProperty("当前等登录人微信号")
    private String openid="";
    @ApiModelProperty("学生id号")
    private long studentid=0L;

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public long getStudentid()
    {
        return studentid;
    }

    public void setStudentid(long studentid)
    {
        this.studentid = studentid;
    }

}
