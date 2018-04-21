package com.example.wx.model;

import java.util.Date;

public class Teacher {
    private Long id;

    private String openid;

    private String username;

    private String password;

    private String studentclass;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public Teacher(Long id, String openid, String username, String password, String studentclass, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.openid = openid;
        this.username = username;
        this.password = password;
        this.studentclass = studentclass;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public Teacher() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass == null ? null : studentclass.trim();
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