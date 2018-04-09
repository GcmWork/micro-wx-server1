package com.example.wx.model;

import java.math.BigDecimal;
import java.util.Date;

public class Recharge {
    private Long id;

    private String openid;

    private String mobilephone;

    private BigDecimal rechargeamount;

    private Date rechargedate;

    private String rechargestatus;

    private Long relationid;

    private String userbh;

    private String studentname;

    private String parentname;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public Recharge(Long id, String openid, String mobilephone, BigDecimal rechargeamount, Date rechargedate, String rechargestatus, Long relationid, String userbh, String studentname, String parentname, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.openid = openid;
        this.mobilephone = mobilephone;
        this.rechargeamount = rechargeamount;
        this.rechargedate = rechargedate;
        this.rechargestatus = rechargestatus;
        this.relationid = relationid;
        this.userbh = userbh;
        this.studentname = studentname;
        this.parentname = parentname;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public Recharge() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public BigDecimal getRechargeamount() {
        return rechargeamount;
    }

    public void setRechargeamount(BigDecimal rechargeamount) {
        this.rechargeamount = rechargeamount;
    }

    public Date getRechargedate() {
        return rechargedate;
    }

    public void setRechargedate(Date rechargedate) {
        this.rechargedate = rechargedate;
    }

    public String getRechargestatus() {
        return rechargestatus;
    }

    public void setRechargestatus(String rechargestatus) {
        this.rechargestatus = rechargestatus == null ? null : rechargestatus.trim();
    }

    public Long getRelationid() {
        return relationid;
    }

    public void setRelationid(Long relationid) {
        this.relationid = relationid;
    }

    public String getUserbh() {
        return userbh;
    }

    public void setUserbh(String userbh) {
        this.userbh = userbh == null ? null : userbh.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getAddfield() {
        return addfield;
    }

    public void setAddfield(String addfield) {
        this.addfield = addfield == null ? null : addfield.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}