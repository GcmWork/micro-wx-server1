package com.example.wx.domain.OutModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/3/26.
 */
public class UnbindReasonInfoOut
{
    @ApiModelProperty("原因说明")
    private String reason="";
    @ApiModelProperty("原因code")
    private Integer reasoncode=0;

    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public Integer getReasoncode()
    {
        return reasoncode;
    }

    public void setReasoncode(Integer reasoncode)
    {
        this.reasoncode = reasoncode;
    }
}
