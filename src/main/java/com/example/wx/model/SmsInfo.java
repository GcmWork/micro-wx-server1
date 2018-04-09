package com.example.wx.model;

import java.util.Date;

public class SmsInfo {
    private Long id;

    private String mobilephone;

    private Integer sendtype;

    private String verificationcode;

    private String content;

    private Integer status;

    private Date cutofftime;

    private Date createtime;

    private Integer isdel;

    private String sendurl;

    private String parameter;

    private String jsonresult;

    public SmsInfo(Long id, String mobilephone, Integer sendtype, String verificationcode, String content, Integer status, Date cutofftime, Date createtime, Integer isdel, String sendurl, String parameter, String jsonresult) {
        this.id = id;
        this.mobilephone = mobilephone;
        this.sendtype = sendtype;
        this.verificationcode = verificationcode;
        this.content = content;
        this.status = status;
        this.cutofftime = cutofftime;
        this.createtime = createtime;
        this.isdel = isdel;
        this.sendurl = sendurl;
        this.parameter = parameter;
        this.jsonresult = jsonresult;
    }

    public SmsInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Integer getSendtype() {
        return sendtype;
    }

    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    public String getVerificationcode() {
        return verificationcode;
    }

    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode == null ? null : verificationcode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCutofftime() {
        return cutofftime;
    }

    public void setCutofftime(Date cutofftime) {
        this.cutofftime = cutofftime;
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

    public String getSendurl() {
        return sendurl;
    }

    public void setSendurl(String sendurl) {
        this.sendurl = sendurl == null ? null : sendurl.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getJsonresult() {
        return jsonresult;
    }

    public void setJsonresult(String jsonresult) {
        this.jsonresult = jsonresult == null ? null : jsonresult.trim();
    }
}