package com.example.wx.service;

import com.example.wx.common.Convert;
import com.example.wx.dao.SpendMapper;
import com.example.wx.domain.InputModel.SpendListInput;
import com.example.wx.model.InAndOutSchoolExample;
import com.example.wx.model.Spend;
import com.example.wx.model.SpendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
@Service
public class SpendService
{
    @Autowired
    SpendMapper spendMapper;
    public List<Spend> GetSpendList (SpendListInput input)
    {
        Convert convert = new Convert();
        SpendExample example=new SpendExample();

        SpendExample.Criteria criteria = example.createCriteria();
        if (input.getStarttime() != "")
        {
            criteria.andSpendtimeGreaterThanOrEqualTo(convert.StrToDate(input.getStarttime()));
        }
        if (input.getEndtime() != "")
        {
            criteria.andSpendtimeLessThanOrEqualTo(convert.StrToDate(input.getEndtime()+" 23:59:59"));
        }
        criteria.andUserbhEqualTo(input.getUserbh()).andIsdelEqualTo(0);
        return  spendMapper.selectByExample(example);
    }
}
