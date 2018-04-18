package com.example.wx.service;

import com.example.wx.common.Convert;
import com.example.wx.dao.InAndOutSchoolMapper;
import com.example.wx.dao.RechargeMapper;
import com.example.wx.domain.InputModel.InandoutschoolListInput;
import com.example.wx.domain.InputModel.RechargeListInput;
import com.example.wx.model.InAndOutSchool;
import com.example.wx.model.InAndOutSchoolExample;
import com.example.wx.model.Recharge;
import com.example.wx.model.RechargeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/16.
 */
@Service
public class InAndOutSchoolService
{
    @Autowired
    InAndOutSchoolMapper inAndOutSchoolMapper;

    public List<InAndOutSchool> GetInAndOutSchoolList(InandoutschoolListInput input)
    {

        Convert convert = new Convert();
        InAndOutSchoolExample example = new InAndOutSchoolExample();
        InAndOutSchoolExample.Criteria criteria = example.createCriteria();
        if (input.getStarttime() != "")
        {
            criteria.andInouttimeLessThanOrEqualTo(convert.StrToDate(input.getStarttime()));
        }
        if (input.getEndtime() != "")
        {
            criteria.andInouttimeLessThanOrEqualTo(convert.StrToDate(input.getEndtime()));
        }
        criteria.andUserbhEqualTo(input.getUserbh()).andIsdelEqualTo(0);
        return  inAndOutSchoolMapper.selectByExample(example);
    }
}
