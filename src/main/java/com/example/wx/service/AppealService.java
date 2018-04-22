package com.example.wx.service;

import com.example.wx.dao.AppealMapper;
import com.example.wx.model.Appeal;
import com.example.wx.model.AppealExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/8.
 */
@Service
public class AppealService
{
    @Autowired
    AppealMapper appealMapper;
    public boolean InsertAppeal(Appeal appeal)
    {
       return appealMapper.insertSelective(appeal)>0;

    }
    public boolean UpdateAppeal(Appeal appeal)
    {
        return appealMapper.updateByPrimaryKeySelective(appeal)>0;
    }

    public Appeal GetAppealById(long appealid)
    {
        return appealMapper.selectByPrimaryKey(appealid);
    }
    public List<Appeal> GetAppealListByOpenId(String OpenId, Integer appealtype)
    {
        AppealExample example=new AppealExample();
        example.createCriteria().andOpenidEqualTo(OpenId).andIsdelEqualTo(0).andAppealtypeEqualTo(appealtype).andAppealresultEqualTo("待审核");
        return appealMapper.selectByExample(example);
    }
    public List<Appeal> GetAppealListByStudentClass(String studentclass,int appealtype)
    {
        AppealExample example=new AppealExample();
        example.createCriteria().andStudentclassEqualTo(studentclass).andIsdelEqualTo(0).andAppealtypeEqualTo(appealtype).andAppealresultEqualTo("待审核");
        return appealMapper.selectByExample(example);
    }

    public Appeal GetAppealByID(long id)
    {
        return appealMapper.selectByPrimaryKey(id);
    }
    public List<Appeal> GetAppealByIDs(List<Long> ids)
    {
        AppealExample example=new AppealExample();
        example.createCriteria().andIsdelEqualTo(0).andIdIn(ids);
        return appealMapper.selectByExample(example);
    }

}
