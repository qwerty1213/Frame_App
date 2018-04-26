package com.dinghaoguoji.com.frame_app.utils;

/**
 * Created by user on 2017/8/2.
 */

public class PostUtil {

    static String key = "_Znzb_IosV1";

    public static String getPassword(String x){

        return MD5Utils.encrypt(x);

    }


    public static String getSignature(String x){

        return MD5Utils.encrypt(x + key);

    }


    public static String getSignature(String x, String y){

        return MD5Utils.encrypt(x + "" + y + key);

    }

    public static String getSignature(String x, String y, String z){

        return MD5Utils.encrypt(x + "" + y + ""+ z + key);

    }
    public static String getSignature(String s1, String s2, String s3, String s4, String s5, String s6, String s7){

        return MD5Utils.encrypt(s1 + s2  + s3  + s4  + s5  + s6  + s7 + key);

    }

    public static String getSignature(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12){

        return MD5Utils.encrypt(s1 +"" + s2 +"" + s3 +"" + s4 +"" + s5 +"" + s6 +"" + s7 +"" + s8 +"" + s9 +"" + s10 +"" + s11 + "" + s12  + "" + key);

    }
    public static String getSignature(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12 ,String s13){

        return MD5Utils.encrypt(s1 +"" + s2 +"" + s3 +"" + s4 +"" + s5 +"" + s6 +"" + s7 +"" + s8 +"" + s9 +"" + s10 +"" + s11 + "" + s12  + "" + s13 + key);

    }

}