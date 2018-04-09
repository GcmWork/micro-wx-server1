package com.example.wx.model;

import java.util.Date;

public class Student {
    private Long id;

    private String usrbh;

    private String name;

    private Integer sex;

    private Integer age;

    private String studentclass;

    private String openid;

    private Date stm;

    private Date etm;

    private String addfield;

    private Date createtime;

    private Integer isdel;

    public Student(Long id, String usrbh, String name, Integer sex, Integer age, String studentclass, String openid, Date stm, Date etm, String addfield, Date createtime, Integer isdel) {
        this.id = id;
        this.usrbh = usrbh;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.studentclass = studentclass;
        this.openid = openid;
        this.stm = stm;
        this.etm = etm;
        this.addfield = addfield;
        this.createtime = createtime;
        this.isdel = isdel;
    }

    public Student() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsrbh() {
        return usrbh;
    }

    public void setUsrbh(String usrbh) {
        this.usrbh = usrbh == null ? null : usrbh.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass == null ? null : studentclass.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Date getStm() {
        return stm;
    }

    public void setStm(Date stm) {
        this.stm = stm;
    }

    public Date getEtm() {
        return etm;
    }

    public void setEtm(Date etm) {
        this.etm = etm;
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