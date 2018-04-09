package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/16.
 */
public class BaseOutModel <T> implements Serializable
{
    @ApiModelProperty(value = "状态码，1为成功；0为失败；")
    private Integer result=0;
    @ApiModelProperty(value = "查询结果描述")
    private String message="";
    private Long timestamp=System.currentTimeMillis();
    @ApiModelProperty("返回的数据，如果该接口需要有数据返回且处理成功，data节点放置要返回的数据；否则为空")
    private  T data=null;


    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Integer getResult()
    {
        return result;
    }

    public void setResult(Integer result)
    {
        this.result = result;
    }



    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }


    public Long getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Long timestamp)
    {
        this.timestamp = timestamp;
    }
}

