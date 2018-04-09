package com.example.wx.controller;

import com.example.wx.common.Convert;
import com.example.wx.common.RequstMethod;
import com.example.wx.domain.InputModel.SendSmsInput;
import com.example.wx.domain.InputModel.ValidateMobileCodeInput;
import com.example.wx.domain.OutModel.BaseOutModel;
import com.example.wx.domain.OutModel.SendSmsResult;
import com.example.wx.model.SmsInfo;
import com.example.wx.service.SmsInfoService;
import com.example.wx.util.JacksonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2018/4/2.
 */

@Api(description="短信相关接口")
@RestController
@RequestMapping("/sms/")
public class SmsController
{
    @Autowired
    SmsInfoService smsInfoService;
    @ApiOperation("发送短信")
    @RequestMapping(value = "/sendsms/",method = RequestMethod.POST)
    public BaseOutModel<SendSmsResult> sendsms(@RequestBody SendSmsInput input)
    {
        Convert convert=new Convert();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        BaseOutModel baseOutModel = new BaseOutModel();
        SmsInfo smsInfo = new SmsInfo();
        smsInfo.setMobilephone(input.getMobile());
        smsInfo.setSendtype(input.getSmstype());
        SendSmsResult sendSmsResult = new SendSmsResult();
        if (input.getSmstype() == 1)
        {
            String code = "";
            Random rand = new Random();//生成随机数
            for (int a = 0; a < 6; a++)
            {
                code += rand.nextInt(10);//生成6位验证码
            }
            String content = "【建邦软件】" + code + "为您的账户绑定验证码，2分钟内有效。如非本人操作，请忽略本短信。";
            smsInfo.setContent(content);
            Date date =new Date();
            smsInfo.setCreatetime(convert.StrToDate(format.format(date)));
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MINUTE, 2);// 24小时制
            Date Cutofftime = cal.getTime();
            smsInfo.setCutofftime(convert.StrToDate(format.format(Cutofftime)));
            sendSmsResult = sendVerificationcode(input.getMobile(), content,smsInfo);
            if(sendSmsResult.getResult().equals(0))
            {
                smsInfo.setStatus(0);
                baseOutModel.setResult(1);
                baseOutModel.setData(sendSmsResult);
            }else
            {
                smsInfo.setStatus(1);
                baseOutModel.setResult(0);
                baseOutModel.setData(sendSmsResult);
            }

        } else
        {
            sendSmsResult=new SendSmsResult();
            sendSmsResult.setResult(1);
            baseOutModel.setData(sendSmsResult);
        }
        smsInfoService.InsertSmsInfo(smsInfo);
        return baseOutModel;
    }

    private SendSmsResult sendVerificationcode(String mobile,String content,SmsInfo smsInfo)
    {
        try
        {
            long epoch = System.currentTimeMillis() / 1000;
            String sig = getSHA256StrJava("appkey=38f974bc3192f128ac27feb5c11b64f4&random=7226249334&time=" + epoch + "&mobile=" + mobile);
            String url = "https://yun.tim.qq.com/v5/tlssmssvr/sendsms?sdkappid=1400077222&random=7226249334";
            Map<String, Object> map = new HashMap<>();
            map.put("ext", "");
            map.put("extend", "");
            map.put("msg",content);
            map.put("sig", sig);
            Map<String, Object> tel = new HashMap<>();
            tel.put("mobile", mobile);
            tel.put("nationcode", "86");
            map.put("tel", tel);
            map.put("time", epoch);
            map.put("type", "0");

            RequstMethod httpUtils = new RequstMethod();
            String jsonStr = JacksonUtil.toJSON(map);
            String result = httpUtils.doPost(url, jsonStr);
            SendSmsResult sendSmsResult= JacksonUtil.fromJSON(result,SendSmsResult.class);
            smsInfo.setSendurl(url);
            smsInfo.setParameter(jsonStr);
            smsInfo.setJsonresult(result);
            return sendSmsResult;

        } catch (Exception e)
        {
            SendSmsResult sendSmsResult=new SendSmsResult();
            sendSmsResult.setErrmsg(e.getMessage());
            sendSmsResult.setResult(1);
            return sendSmsResult;
        }
    }

    @ApiOperation("验证码验证")
    @RequestMapping(value = "/validatemobilecode/",method = RequestMethod.POST)
    public  BaseOutModel  validatemobilecode(@RequestBody ValidateMobileCodeInput input)
    {
        BaseOutModel baseOutModel = new BaseOutModel();
        boolean flag = smsInfoService.ValidateMobile(input);
        if (flag)
        {
            baseOutModel.setMessage("验证码正确");
            baseOutModel.setResult(1);
            return baseOutModel;
        } else
        {
            baseOutModel.setMessage("验证码有误或过期");
            baseOutModel.setResult(0);
            return baseOutModel;
        }
    }
    public static String getSHA256StrJava(String str){
        MessageDigest messageDigest;
        String encodeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            encodeStr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeStr;
    }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
