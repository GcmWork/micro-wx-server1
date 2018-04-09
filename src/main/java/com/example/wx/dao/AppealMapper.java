package com.example.wx.dao;

import com.example.wx.model.Appeal;
import com.example.wx.model.AppealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppealMapper {
    long countByExample(AppealExample example);

    int deleteByExample(AppealExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Appeal record);

    int insertSelective(Appeal record);

    List<Appeal> selectByExample(AppealExample example);

    Appeal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Appeal record, @Param("example") AppealExample example);

    int updateByExample(@Param("record") Appeal record, @Param("example") AppealExample example);

    int updateByPrimaryKeySelective(Appeal record);

    int updateByPrimaryKey(Appeal record);
}