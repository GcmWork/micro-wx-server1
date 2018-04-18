package com.example.wx.controller;

import com.example.wx.common.Convert;
import com.example.wx.domain.InputModel.InandoutschoolListInput;
import com.example.wx.domain.InputModel.SpendListInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.InandoutschoolListOut;
import com.example.wx.domain.OutModel.SpendInfoOut;
import com.example.wx.domain.OutModel.SpendListOut;
import com.example.wx.model.Spend;
import com.example.wx.service.SpendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/9.
 */

@Api(description="消费相关接口")
@RestController
@RequestMapping("/spend/")
public class SpendController
{
    @Autowired
    SpendService spendService;
    @ApiOperation("消费记录查询")
    @RequestMapping(value = "/spendlist/", method = RequestMethod.POST)
    public BaseOutModel<SpendListOut> SpendList(@RequestBody SpendListInput input)
    {
        Convert convert=new Convert();
        BaseOutModel baseOutModel=new BaseOutModel();
        SpendListOut listOut=new SpendListOut();
        List<Spend> list= spendService.GetSpendList(input);
        if(list.size()>0)
        {
            List<SpendInfoOut> infoOuts=new ArrayList<>();
            for (Spend item:list)
            {
                SpendInfoOut infoOut=new SpendInfoOut();
                infoOut.setAfteramount(item.getAfteramount());
                infoOut.setAmount(item.getAmount());
                infoOut.setSpendtype(item.getSpendtype());
                infoOut.setSpendtime(convert.DateToStr(item.getSpendtime()));
                infoOut.setBeforeamount(item.getBeforeamount());
                infoOuts.add(infoOut);
            }

            listOut.setList(infoOuts);
            baseOutModel.setMessage("查询成功");
            baseOutModel.setResult(1);
            baseOutModel.setData(listOut);
        }else
        {

            baseOutModel.setMessage("没有相关数据");
            baseOutModel.setResult(0);
        }


        return  baseOutModel;

    }
}
