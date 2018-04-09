package com.example.wx.domain.OutModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public class BiddingListOut
{
    private List<BiddingInfoOut> list=new ArrayList<>();

    public List<BiddingInfoOut> getList()
    {
        return list;
    }

    public void setList(List<BiddingInfoOut> list)
    {
        this.list = list;
    }



}
