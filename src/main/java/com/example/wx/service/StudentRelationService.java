package com.example.wx.service;

import com.example.wx.dao.StudentRelationMapper;
import com.example.wx.domain.InputModel.UnbindInput;
import com.example.wx.model.StudentRelation;
import com.example.wx.model.StudentRelationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/27.
 */
@Service
public class StudentRelationService
{
    @Autowired
    StudentRelationMapper studentRelationMapper;
    public Long getCountByStudentid(long Studentid)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).andStudentidEqualTo(Studentid);
       return studentRelationMapper.countByExample(example);
    }
    public Long getCountByOpenid(String openid)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).andOpenidEqualTo(openid);
        return studentRelationMapper.countByExample(example);
    }
    public List<StudentRelation> getRelationListByOpenid(String openid)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).andOpenidEqualTo(openid);
        return studentRelationMapper.selectByExample(example);
    }
    public StudentRelation getRelationListByStudentidAndOpenid(String openid, long Studentid)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).andOpenidEqualTo(openid).andStudentidEqualTo(Studentid);
        List<StudentRelation> list= studentRelationMapper.selectByExample(example);
        if (list.size() > 0)
        {
            return list.get(0);
        }
        return null;
    }
    public StudentRelation getRelationListByUnbindInput(UnbindInput input)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).
                andOpenidEqualTo(input.getOpenid()).andStudentidEqualTo(input.getStudentid()).
                andMobilephoneEqualTo(input.getMobilephone());
        List<StudentRelation> list= studentRelationMapper.selectByExample(example);
        if (list.size() > 0)
        {
            return list.get(0);
        }
        return null;
    }
    public Long getCountByOpenidandStudentId(String openid,long Studentid)
    {
        StudentRelationExample example=new StudentRelationExample();
        example.createCriteria().andIsdelEqualTo(0).andStatusEqualTo(1).andOpenidEqualTo(openid).andStudentidEqualTo(Studentid);
        return studentRelationMapper.countByExample(example);
    }
    public Integer InsertRelation (StudentRelation studentRelation)
    {
        return studentRelationMapper.insertSelective(studentRelation);
    }
    public Integer updateRelation (StudentRelation studentRelation)
    {
        return studentRelationMapper.updateByPrimaryKeySelective(studentRelation);
    }
    public StudentRelation getStudetntRelationByID (long studentRelationid)
    {
        return studentRelationMapper.selectByPrimaryKey(studentRelationid);
    }
}
