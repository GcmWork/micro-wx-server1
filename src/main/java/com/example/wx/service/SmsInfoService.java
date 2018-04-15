package com.example.wx.service;

import com.example.wx.dao.SmsInfoMapper;
import com.example.wx.domain.InputModel.ValidateMobileCodeInput;
import com.example.wx.model.SmsInfo;
import com.example.wx.model.SmsInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/30.
 */
@Service
public class SmsInfoService
{
    @Autowired
    SmsInfoMapper smsInfoMapper;
    public Integer InsertSmsInfo(SmsInfo smsInfo)
    {
       return smsInfoMapper.insertSelective(smsInfo);
    }

    public boolean ValidateMobile(ValidateMobileCodeInput input)
    {
        SmsInfoExample example=new SmsInfoExample();
        example.createCriteria().andStatusEqualTo(1).andIsdelEqualTo(0).andSendtypeEqualTo(0).andMobilephoneEqualTo(input.getMobilephone()).andVerificationcodeEqualTo(input.getVerificationcode()).
                andCreatetimeLessThan(new Date()).andCutofftimeGreaterThan(new Date());
       List<SmsInfo> list= smsInfoMapper.selectByExample(example);
       return list.size()>0;
    }
}
