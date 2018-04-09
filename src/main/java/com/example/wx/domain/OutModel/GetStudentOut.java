package com.example.wx.domain.OutModel;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/8.
 */
public class GetStudentOut
{
    private Long id;

    private String usrbh;

    private String name;

    private Integer sex;

    private Integer age;

    private String studentclass;

    private String openid;

    private Date stm;

    private Date etm;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsrbh()
    {
        return usrbh;
    }

    public void setUsrbh(String usrbh)
    {
        this.usrbh = usrbh;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSex()
    {
        return sex;
    }

    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getStudentclass()
    {
        return studentclass;
    }

    public void setStudentclass(String studentclass)
    {
        this.studentclass = studentclass;
    }

    public String getOpenid()
    {
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public Date getStm()
    {
        return stm;
    }

    public void setStm(Date stm)
    {
        this.stm = stm;
    }

    public Date getEtm()
    {
        return etm;
    }

    public void setEtm(Date etm)
    {
        this.etm = etm;
    }
}
