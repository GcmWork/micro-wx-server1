package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class BiddingInfoOut
{

    @ApiModelProperty("学生id")
    public long studentid=0L;
    @ApiModelProperty("学号")
    public String usebh="";
    @ApiModelProperty("学生姓名")
    public String name="";


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsebh()
    {
        return usebh;
    }

    public void setUsebh(String usebh)
    {
        this.usebh = usebh;
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
