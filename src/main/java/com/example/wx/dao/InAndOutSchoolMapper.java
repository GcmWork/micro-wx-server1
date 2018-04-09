package com.example.wx.dao;

import com.example.wx.model.InAndOutSchool;
import com.example.wx.model.InAndOutSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InAndOutSchoolMapper {
    long countByExample(InAndOutSchoolExample example);

    int deleteByExample(InAndOutSchoolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InAndOutSchool record);

    int insertSelective(InAndOutSchool record);

    List<InAndOutSchool> selectByExample(InAndOutSchoolExample example);

    InAndOutSchool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InAndOutSchool record, @Param("example") InAndOutSchoolExample example);

    int updateByExample(@Param("record") InAndOutSchool record, @Param("example") InAndOutSchoolExample example);

    int updateByPrimaryKeySelective(InAndOutSchool record);

    int updateByPrimaryKey(InAndOutSchool record);
}