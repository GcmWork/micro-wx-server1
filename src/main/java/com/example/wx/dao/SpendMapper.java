package com.example.wx.dao;

import com.example.wx.model.Spend;
import com.example.wx.model.SpendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpendMapper {
    long countByExample(SpendExample example);

    int deleteByExample(SpendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Spend record);

    int insertSelective(Spend record);

    List<Spend> selectByExample(SpendExample example);

    Spend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByExample(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByPrimaryKeySelective(Spend record);

    int updateByPrimaryKey(Spend record);
}