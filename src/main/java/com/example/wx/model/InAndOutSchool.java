package com.example.wx.model;

import java.util.Date;

public class InAndOutSchool {
    private Long id;

    private String userbh;

    private String inouttype;

    private Date inouttime;

    private String place;

    private String inoutmemo;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public InAndOutSchool(Long id, String userbh, String inouttype, Date inouttime, String place, String inoutmemo, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.userbh = userbh;
        this.inouttype = inouttype;
        this.inouttime = inouttime;
        this.place = place;
        this.inoutmemo = inoutmemo;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public InAndOutSchool() {
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

    public String getInouttype() {
        return inouttype;
    }

    public void setInouttype(String inouttype) {
        this.inouttype = inouttype == null ? null : inouttype.trim();
    }

    public Date getInouttime() {
        return inouttime;
    }

    public void setInouttime(Date inouttime) {
        this.inouttime = inouttime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getInoutmemo() {
        return inoutmemo;
    }

    public void setInoutmemo(String inoutmemo) {
        this.inoutmemo = inoutmemo == null ? null : inoutmemo.trim();
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