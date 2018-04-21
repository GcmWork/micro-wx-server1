package com.example.wx.model;

import java.math.BigDecimal;
import java.util.Date;

public class Appeal {
    private Long id;

    private Long relationid;

    private String openid;

    private String poarentname;

    private String relation;

    private String studentname;

    private Date appealtime;

    private Integer appealtype;

    private String oldmobilephone;

    private String newmobilephone;

    private String appealresult;

    private Date rechargetime1;

    private BigDecimal amount1;

    private Date rechargetime2;

    private BigDecimal amount2;

    private Date rechargetime3;

    private BigDecimal amount3;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    private String studentclass;

    public Appeal(Long id, Long relationid, String openid, String poarentname, String relation, String studentname, Date appealtime, Integer appealtype, String oldmobilephone, String newmobilephone, String appealresult, Date rechargetime1, BigDecimal amount1, Date rechargetime2, BigDecimal amount2, Date rechargetime3, BigDecimal amount3, String addfield, Date createtime, Integer isdel, String studentclass) {
        this.id = id;
        this.relationid = relationid;
        this.openid = openid;
        this.poarentname = poarentname;
        this.relation = relation;
        this.studentname = studentname;
        this.appealtime = appealtime;
        this.appealtype = appealtype;
        this.oldmobilephone = oldmobilephone;
        this.newmobilephone = newmobilephone;
        this.appealresult = appealresult;
        this.rechargetime1 = rechargetime1;
        this.amount1 = amount1;
        this.rechargetime2 = rechargetime2;
        this.amount2 = amount2;
        this.rechargetime3 = rechargetime3;
        this.amount3 = amount3;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
        this.studentclass = studentclass;
    }

    public Appeal() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationid() {
        return relationid;
    }

    public void setRelationid(Long relationid) {
        this.relationid = relationid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPoarentname() {
        return poarentname;
    }

    public void setPoarentname(String poarentname) {
        this.poarentname = poarentname == null ? null : poarentname.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Date getAppealtime() {
        return appealtime;
    }

    public void setAppealtime(Date appealtime) {
        this.appealtime = appealtime;
    }

    public Integer getAppealtype() {
        return appealtype;
    }

    public void setAppealtype(Integer appealtype) {
        this.appealtype = appealtype;
    }

    public String getOldmobilephone() {
        return oldmobilephone;
    }

    public void setOldmobilephone(String oldmobilephone) {
        this.oldmobilephone = oldmobilephone == null ? null : oldmobilephone.trim();
    }

    public String getNewmobilephone() {
        return newmobilephone;
    }

    public void setNewmobilephone(String newmobilephone) {
        this.newmobilephone = newmobilephone == null ? null : newmobilephone.trim();
    }

    public String getAppealresult() {
        return appealresult;
    }

    public void setAppealresult(String appealresult) {
        this.appealresult = appealresult == null ? null : appealresult.trim();
    }

    public Date getRechargetime1() {
        return rechargetime1;
    }

    public void setRechargetime1(Date rechargetime1) {
        this.rechargetime1 = rechargetime1;
    }

    public BigDecimal getAmount1() {
        return amount1;
    }

    public void setAmount1(BigDecimal amount1) {
        this.amount1 = amount1;
    }

    public Date getRechargetime2() {
        return rechargetime2;
    }

    public void setRechargetime2(Date rechargetime2) {
        this.rechargetime2 = rechargetime2;
    }

    public BigDecimal getAmount2() {
        return amount2;
    }

    public void setAmount2(BigDecimal amount2) {
        this.amount2 = amount2;
    }

    public Date getRechargetime3() {
        return rechargetime3;
    }

    public void setRechargetime3(Date rechargetime3) {
        this.rechargetime3 = rechargetime3;
    }

    public BigDecimal getAmount3() {
        return amount3;
    }

    public void setAmount3(BigDecimal amount3) {
        this.amount3 = amount3;
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

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass == null ? null : studentclass.trim();
    }
}