package com.example.wx.service;

import com.example.wx.dao.TeacherMapper;
import com.example.wx.domain.InputModel.GetTeacherInfoInput;
import com.example.wx.model.Teacher;
import com.example.wx.model.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/21.
 */

@Service
public class TeacherService
{
    @Autowired
    TeacherMapper teacherMapper;
    public Teacher GetTeacherInfoByUserName(GetTeacherInfoInput infoInput)
    {
        TeacherExample example=new TeacherExample();
        example.createCriteria().andIsdelEqualTo(0).andUsernameEqualTo(infoInput.getUsername()).andPasswordEqualTo(infoInput.getPassword());
        List<Teacher> list = teacherMapper.selectByExample(example);
        if(list.size()>0)
        {
            return  list.get(0);
        }else
        {
            return null;
        }
    }
}
