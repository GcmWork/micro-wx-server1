package com.example.wx.model;

import java.math.BigDecimal;
import java.util.Date;

public class StudentRelation {
    private Long id;

    private String openid;

    private Long studentid;

    private String parentname;

    private String relation;

    private String mobilephone;

    private Integer status;

    private BigDecimal balance;

    private Date nobindtime;

    private String nobindreason;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public StudentRelation(Long id, String openid, Long studentid, String parentname, String relation, String mobilephone, Integer status, BigDecimal balance, Date nobindtime, String nobindreason, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.openid = openid;
        this.studentid = studentid;
        this.parentname = parentname;
        this.relation = relation;
        this.mobilephone = mobilephone;
        this.status = status;
        this.balance = balance;
        this.nobindtime = nobindtime;
        this.nobindreason = nobindreason;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public StudentRelation() {
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

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getNobindtime() {
        return nobindtime;
    }

    public void setNobindtime(Date nobindtime) {
        this.nobindtime = nobindtime;
    }

    public String getNobindreason() {
        return nobindreason;
    }

    public void setNobindreason(String nobindreason) {
        this.nobindreason = nobindreason == null ? null : nobindreason.trim();
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