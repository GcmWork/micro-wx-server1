package com.example.wx.controller;

import com.example.wx.common.Convert;
import com.example.wx.domain.InputModel.RechargeListInput;
import com.example.wx.domain.InputModel.RechargeMoneyInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.RechargeInfoOut;
import com.example.wx.domain.OutModel.RechargeListOut;
import com.example.wx.model.Recharge;
import com.example.wx.model.Student;
import com.example.wx.model.StudentRelation;
import com.example.wx.service.RechargeService;
import com.example.wx.service.StudentRelationService;
import com.example.wx.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/4/8.
 */

@Api(description="充值相关接口")
@RestController
@RequestMapping("/recharge/")
public class RechargeController
{
    @Autowired
    StudentRelationService studentRelationService;
    @Autowired
    StudentService studentService;
    @Autowired
    RechargeService rechargeService;

    @ApiOperation("提交充值")
    @RequestMapping(value = "/rechargemoney/",method = RequestMethod.POST)
    public BaseOutModel RechargeMoney(@RequestBody RechargeMoneyInput input)
    {
        BaseOutModel baseOutModel=new BaseOutModel();
       StudentRelation relation=studentRelationService.getStudetntRelationByID(input.getRelationid());
       Student student= studentService.GetStudentByID(relation.getStudentid());
        Recharge recharge=new Recharge();
        recharge.setMobilephone(input.getMobilephone());
        recharge.setRelationid(input.getRelationid());
        recharge.setOpenid(input.getOpenid());
        recharge.setParentname(relation.getParentname());
        recharge.setStudentname(student.getName());
        recharge.setRechargeamount(input.getRechargeamount());
        recharge.setRechargedate(new Date());
        recharge.setRechargestatus(input.getRechargestatus());
        recharge.setUserbh(student.getUsrbh());
        recharge.setAddfield(input.getAddfield());

       if( rechargeService.InsertRecharge(recharge))
       {
           student.setBalance(student.getBalance().add(input.getRechargeamount()));
           studentService.UpdateStudentByID(student);
           baseOutModel.setResult(1);
           baseOutModel.setMessage("充值成功");
       }else
       {
           baseOutModel.setResult(0);
           baseOutModel.setMessage("充值失败");
       }
        return  baseOutModel;
    }
    @ApiOperation("充值记录")
    @RequestMapping(value = "/getrechargelist/",method = RequestMethod.POST)
    public BaseOutModel<RechargeListOut> GetRechargeList(@RequestBody RechargeListInput input)
    {
        Convert convert=new Convert();
        BaseOutModel baseOutModel = new BaseOutModel();
        List<Recharge> list = rechargeService.GetRechargeList(input);
        RechargeListOut out = new RechargeListOut();
        if (list.size() > 0)
        {
            List<RechargeInfoOut> infoOuts = new ArrayList<>();
            for (Recharge item : list)
            {
                RechargeInfoOut infoOut = new RechargeInfoOut();
                infoOut.setAddfield(item.getAddfield());
                infoOut.setUserbh(item.getUserbh());
                infoOut.setMobilephone(item.getMobilephone());
                infoOut.setRechargestatus(item.getRechargestatus());
                infoOut.setOpenid(item.getOpenid());
                infoOut.setParentname(item.getParentname());
                infoOut.setRechargeamount(item.getRechargeamount());
                infoOut.setRechargedate(convert.DateToStr2(item.getRechargedate()));
                infoOut.setStudentname(item.getStudentname());
                infoOuts.add(infoOut);
            }
            out.setList(infoOuts);
            baseOutModel.setData(out);
            baseOutModel.setResult(1);
            baseOutModel.setMessage("查询成功");
        } else
        {
            baseOutModel.setResult(0);
            baseOutModel.setMessage("没有充值记录");
        }
        return baseOutModel;
    }
}
