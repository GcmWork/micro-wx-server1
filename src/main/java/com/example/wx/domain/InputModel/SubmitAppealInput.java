package com.example.wx.domain.InputModel;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/26.
 */
public class SubmitAppealInput
{
    @ApiModelProperty("申诉人与学生关系")
    private String relation="";
    @ApiModelProperty("学生id")
    public long studentid=0l;
    @ApiModelProperty("申诉人微信号")
    private String openid="";
    @ApiModelProperty("申诉类型 1在线申诉 2 电话申诉")
    private Integer appealtype=0;
    @ApiModelProperty("原号码")
    private String oldmobilephone;
    @ApiModelProperty("新号码")
    private String newmobilephone;
    @ApiModelProperty("第一次充值时间")
    private Date rechargetime1;
    @ApiModelProperty("第一次充值金额")
    private BigDecimal amount1;
    @ApiModelProperty("第二次充值时间")
    private Date rechargetime2;
    @ApiModelProperty("第二次充值金额")
    private BigDecimal amount2;
    @ApiModelProperty("第三次充值时间")
    private Date rechargetime3;
    @ApiModelProperty("第三次充值金额")
    private BigDecimal amount3;

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

    public String getOldmobilephone()
    {
        return oldmobilephone;
    }

    public void setOldmobilephone(String oldmobilephone)
    {
        this.oldmobilephone = oldmobilephone;
    }

    public String getNewmobilephone()
    {
        return newmobilephone;
    }

    public void setNewmobilephone(String newmobilephone)
    {
        this.newmobilephone = newmobilephone;
    }

    public Date getRechargetime1()
    {
        return rechargetime1;
    }

    public void setRechargetime1(Date rechargetime1)
    {
        this.rechargetime1 = rechargetime1;
    }

    public BigDecimal getAmount1()
    {
        return amount1;
    }

    public void setAmount1(BigDecimal amount1)
    {
        this.amount1 = amount1;
    }

    public Date getRechargetime2()
    {
        return rechargetime2;
    }

    public void setRechargetime2(Date rechargetime2)
    {
        this.rechargetime2 = rechargetime2;
    }

    public BigDecimal getAmount2()
    {
        return amount2;
    }

    public void setAmount2(BigDecimal amount2)
    {
        this.amount2 = amount2;
    }

    public Date getRechargetime3()
    {
        return rechargetime3;
    }

    public void setRechargetime3(Date rechargetime3)
    {
        this.rechargetime3 = rechargetime3;
    }

    public BigDecimal getAmount3()
    {
        return amount3;
    }

    public void setAmount3(BigDecimal amount3)
    {
        this.amount3 = amount3;
    }


    public String getRelation()
    {
        return relation;
    }

    public void setRelation(String relation)
    {
        this.relation = relation;
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
