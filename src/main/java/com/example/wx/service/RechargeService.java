package com.example.wx.service;

import com.example.wx.common.Convert;
import com.example.wx.dao.RechargeMapper;
import com.example.wx.domain.InputModel.RechargeListInput;
import com.example.wx.model.Recharge;
import com.example.wx.model.RechargeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/9.
 */
@Service
public class RechargeService
{
    @Autowired
    RechargeMapper rechargeMapper;
    public boolean InsertRecharge(Recharge recharge)
    {
       return rechargeMapper.insertSelective(recharge)>0;
    }
    public List<Recharge> GetRechargeList(RechargeListInput input)
    {

        Convert convert = new Convert();
        RechargeExample example = new RechargeExample();
        RechargeExample.Criteria criteria = example.createCriteria();
        if (input.getStarttime() != "")
        {
            criteria.andRechargedateGreaterThanOrEqualTo(convert.StrToDate(input.getStarttime()));
        }
        if (input.getEndtime() != "")
        {
            criteria.andRechargedateLessThanOrEqualTo(convert.StrToDate(input.getEndtime()));
        }
        criteria.andOpenidEqualTo(input.getOpenid()).andRelationidEqualTo(input.getRelationid());
        return rechargeMapper.selectByExample(example);
    }

}
