package com.example.wx.dao;

import com.example.wx.model.StudentRelation;
import com.example.wx.model.StudentRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentRelationMapper {
    long countByExample(StudentRelationExample example);

    int deleteByExample(StudentRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentRelation record);

    int insertSelective(StudentRelation record);

    List<StudentRelation> selectByExample(StudentRelationExample example);

    StudentRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentRelation record, @Param("example") StudentRelationExample example);

    int updateByExample(@Param("record") StudentRelation record, @Param("example") StudentRelationExample example);

    int updateByPrimaryKeySelective(StudentRelation record);

    int updateByPrimaryKey(StudentRelation record);
}