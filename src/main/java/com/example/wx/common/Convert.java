package com.example.wx.common;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by SLL on 2017/4/14.
 */
public class Convert
{


    /**
     *  
     * 日期转换成字符串 
     *
     * @param date 
     * @return str 
     */
    public String DateToStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        return str;
    }


    /**
     *  
     * 日期转换成字符串 
     *
     * @param date 
     * @return str 
     */
    public String DateToStr1(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = format.format(date);
        return str;
    }


    /**
     * 获取当前时间
     *
     * @return
     */
    public Date getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            time = sdf.parse(sdf.format(new Date()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    /**
     *  
     * 字符串转换成日期 
     *
     * @param str 
     * @return date 
     */
    public Date StrToDate(String str) {
        if (str.length() <= 10) {
            str = str.trim() + " 00:00:00";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /*当前时间 前多少天的日期计算*/
    public String AddDay(int day) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, day);
        Date monday = c.getTime();
        String preMonday = sdf.format(monday);
        return preMonday;
    }

    //返回时间
    public Date DteDefault(String str) {
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);

        } catch (Exception e) {
            date = new Date();
        }
        return date;
    }

    /**
     * 验证手机号码
     *
     * @param mobile
     * @return
     */
    public String checkMobile(String mobile) {
        if (mobile.equals(null)) {
            return "手机号码不能为空！";
            /*^匹配开始地方$匹配结束地方，[3|4|5|7|8]选择其中一个{4,8},\d从[0-9]选择 
      {4,8}匹配次数4~8    ，java中/表示转义，所以在正则表达式中//匹配/,/匹配""*/
            //验证手机号码格式是否正确  
        } else if (!mobile.matches("^1[3|4|5|7|8][0-9]\\d{4,8}$")) {
            return "手机号输入有误，请重新输入";
        } else {
            return "号码正确";
        }
    }


    /**
     * 根据两点间经纬度坐标（double值），计算两点间距离，单位为米
     *
     * @param lng1
     * @param lat1
     * @param lng2
     * @param lat2
     * @return
     */

    //地球平均半径
    private static final double EARTH_RADIUS = 6378137;

    public static double getDistanceFromXtoY(double lng1, double lat1, double lng2, double lat2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(
                Math.sqrt(
                        Math.pow(Math.sin(a / 2), 2)
                                + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)
                )
        );
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return div(s, 1000, 3);
    }


    //把经纬度转为度（°）
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 进行除法运算
     *
     * @param d1
     * @param d2
     * @param len
     * @return
     */
    public static double div(double d1, double d2, int len) {// 进行除法运算
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
