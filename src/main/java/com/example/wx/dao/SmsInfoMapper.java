package com.example.wx.dao;

import com.example.wx.model.SmsInfo;
import com.example.wx.model.SmsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsInfoMapper {
    long countByExample(SmsInfoExample example);

    int deleteByExample(SmsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsInfo record);

    int insertSelective(SmsInfo record);

    List<SmsInfo> selectByExample(SmsInfoExample example);

    SmsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsInfo record, @Param("example") SmsInfoExample example);

    int updateByExample(@Param("record") SmsInfo record, @Param("example") SmsInfoExample example);

    int updateByPrimaryKeySelective(SmsInfo record);

    int updateByPrimaryKey(SmsInfo record);
}