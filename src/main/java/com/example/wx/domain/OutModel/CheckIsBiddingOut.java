package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class CheckIsBiddingOut
{
    @ApiModelProperty("是否有绑定，1有绑定学生信息不为空，0 无绑定 以下学生信息为空")
    public Integer isbidding=0;
    @ApiModelProperty("学号")
    public String userbh="";
    @ApiModelProperty("学生姓名")
    public String name="";
    @ApiModelProperty("学生班级")
    public String studentclass="";
    @ApiModelProperty("当前登录人的微信号")
    public String openid="";
    @ApiModelProperty("与孩子关系")
    public String relation="";
    @ApiModelProperty("家长姓名")
    public String parentname="";
    @ApiModelProperty("手机号码")
    public String mobilephone="";


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getStudentclass()
    {
        return studentclass;
    }

    public void setStudentclass(String studentclass)
    {
        this.studentclass = studentclass;
    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getRelation()
    {
        return relation;
    }

    public void setRelation(String relation)
    {
        this.relation = relation;
    }

    public String getParentname()
    {
        return parentname;
    }

    public void setParentname(String parentname)
    {
        this.parentname = parentname;
    }

    public String getMobilephone()
    {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone)
    {
        this.mobilephone = mobilephone;
    }

    public Integer getIsbidding()
    {
        return isbidding;
    }

    public void setIsbidding(Integer isbidding)
    {
        this.isbidding = isbidding;
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
