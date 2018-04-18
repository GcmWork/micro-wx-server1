package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/3/26.
 */
public class GetBidingInfoOut
{
    @ApiModelProperty("学号")
    public String userbh="";
    @ApiModelProperty("学生姓名")
    public String name="";
    @ApiModelProperty("学生班级")
    public String studentclass="";
    @ApiModelProperty("与孩子关系")
    public String relation="";
    @ApiModelProperty("家长姓名")
    public String parentname="";
    @ApiModelProperty("手机号码")
    public String mobilephone="";
    @ApiModelProperty("余额")
    public BigDecimal balance=BigDecimal.valueOf(0);
    @ApiModelProperty
    public Long studentid=0L;

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

    public String getUserbh()
    {
        return userbh;
    }

    public void setUserbh(String userbh)
    {
        this.userbh = userbh;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getStudentid()
    {
        return studentid;
    }

    public void setStudentid(Long studentid)
    {
        this.studentid = studentid;
    }
}
