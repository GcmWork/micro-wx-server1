package com.example.wx.model;

import java.math.BigDecimal;
import java.util.Date;

public class Spend {
    private Long id;

    private String userbh;

    private String spendtype;

    private Date spendtime;

    private String place;

    private String endpoint;

    private BigDecimal beforeamount;

    private BigDecimal amount;

    private BigDecimal afteramount;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public Spend(Long id, String userbh, String spendtype, Date spendtime, String place, String endpoint, BigDecimal beforeamount, BigDecimal amount, BigDecimal afteramount, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.userbh = userbh;
        this.spendtype = spendtype;
        this.spendtime = spendtime;
        this.place = place;
        this.endpoint = endpoint;
        this.beforeamount = beforeamount;
        this.amount = amount;
        this.afteramount = afteramount;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public Spend() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserbh() {
        return userbh;
    }

    public void setUserbh(String userbh) {
        this.userbh = userbh == null ? null : userbh.trim();
    }

    public String getSpendtype() {
        return spendtype;
    }

    public void setSpendtype(String spendtype) {
        this.spendtype = spendtype == null ? null : spendtype.trim();
    }

    public Date getSpendtime() {
        return spendtime;
    }

    public void setSpendtime(Date spendtime) {
        this.spendtime = spendtime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint == null ? null : endpoint.trim();
    }

    public BigDecimal getBeforeamount() {
        return beforeamount;
    }

    public void setBeforeamount(BigDecimal beforeamount) {
        this.beforeamount = beforeamount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAfteramount() {
        return afteramount;
    }

    public void setAfteramount(BigDecimal afteramount) {
        this.afteramount = afteramount;
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