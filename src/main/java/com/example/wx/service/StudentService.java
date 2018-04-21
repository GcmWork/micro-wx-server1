package com.example.wx.service;

import com.example.wx.dao.StudentMapper;
import com.example.wx.model.Student;
import com.example.wx.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
@Service
public class StudentService
{
    @Autowired
    StudentMapper studentMapper;

    public Student GetStudentByUserbh(String userbh, String Name, String StudentClass)
    {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andIsdelEqualTo(0);
        if (userbh != "")
        {
            criteria.andUsrbhEqualTo(userbh);
        }
        if (Name != "")
        {
            criteria.andNameEqualTo(Name);
        }
        if (StudentClass != "")
        {
            criteria.andStudentclassEqualTo(StudentClass);
        }
        List<Student> list = studentMapper.selectByExample(example);
        if (list.size() > 0)
        {
            return list.get(0);
        }
        return null;
    }

    public Student GetStudentByID(Long studentid)
    {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andIsdelEqualTo(0);
       criteria.andIdEqualTo(studentid);
        List<Student> list = studentMapper.selectByExample(example);
        if (list.size() > 0)
        {
            return list.get(0);
        }
        return null;
    }

    public  boolean UpdateStudentByID(Student student)
    {
        return  studentMapper.updateByPrimaryKeySelective(student)>0;
    }

}
