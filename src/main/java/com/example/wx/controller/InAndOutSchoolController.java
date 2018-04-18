package com.example.wx.controller;

import com.example.wx.common.Convert;
import com.example.wx.domain.InputModel.InandoutschoolListInput;
import com.example.wx.domain.InputModel.SubmitAppealInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.InandoutschoolInfoOut;
import com.example.wx.domain.OutModel.InandoutschoolListOut;
import com.example.wx.domain.OutModel.SubmitAppealOut;
import com.example.wx.model.InAndOutSchool;
import com.example.wx.service.InAndOutSchoolService;
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
 * Created by Administrator on 2018/4/16.
 */

@Api(description="进出校园")
@RestController
@RequestMapping("/inandoutschool/")
public class InAndOutSchoolController
{
    @Autowired
    InAndOutSchoolService inAndOutSchoolService;
    @ApiOperation("进出校园查询")
    @RequestMapping(value = "/inandoutschoollist/", method = RequestMethod.POST)
    public BaseOutModel<InandoutschoolListOut> InandoutschoolList(@RequestBody InandoutschoolListInput input)
    {
        InandoutschoolListOut inandoutschoolListOut=new InandoutschoolListOut();
        Convert convert=new Convert();

        BaseOutModel baseOutModel=new BaseOutModel();
        List<InAndOutSchool> list=inAndOutSchoolService.GetInAndOutSchoolList(input);
        if(list.size()>0)
        {
            List<InandoutschoolInfoOut> infoOuts=new ArrayList<>();
            for (InAndOutSchool item:list)
            {

                InandoutschoolInfoOut inandoutschoolInfoOut=new InandoutschoolInfoOut();
                inandoutschoolInfoOut.setInouttype(item.getInouttype());
                inandoutschoolInfoOut.setPlace(item.getPlace());
                inandoutschoolInfoOut.setInouttime(convert.DateToStr1(item.getInouttime()));
                infoOuts.add(inandoutschoolInfoOut);
            }
            inandoutschoolListOut.setList(infoOuts);
            baseOutModel.setMessage("查询成功");
            baseOutModel.setResult(1);
            baseOutModel.setData(inandoutschoolListOut);
        }else
        {

            baseOutModel.setMessage("没有相关数据");
            baseOutModel.setResult(0);
            baseOutModel.setData(inandoutschoolListOut);
        }
        return baseOutModel;


    }
}
