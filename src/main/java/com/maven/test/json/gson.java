package com.maven.test.json;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.maven.model.User;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-09
 * Time: 13:19
 */
public class gson {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlData= new java.sql.Date(date.getTime());

        java.sql.Time time = new java.sql.Time(date.getTime());
        java.sql.Timestamp timeStamp = new java.sql.Timestamp(date.getTime());
        // 1577256223486
        System.out.println("new java.util.Date().getTime() 时间格式 == " + date.getTime());

        // Wed Dec 25 14:43:43 CST 2019
        System.out.println("new java.util.Date() 时间格式 == " + date);
        // 2019-12-25
        System.out.println("new java.sql.Date(date.getTime()) 时间格式 == " + sqlData);
        // 2019-12-25 14:43:43.486
        System.out.println("new java.sql.Timestamp(date.getTime()) 时间格式 == " + timeStamp);
        // 14:43:43
        System.out.println("new java.sql.Time(date.getTime()) 时间格式 == " + time);

        User user = new User();
        user.setUserName("root");
        user.setUserId(1);
        user.setEnable(1);
        user.setGenTime(date);
        user.setLoginTime(sqlData);
        user.setLastLoginTime(timeStamp);
        // Wed Dec 25 14:43:43 CST 2019
        System.out.println("new Date()的时间格式 == "+user.getGenTime());
        String json = new Gson().toJson(user);
        // {"userId":1,"userName":"root","enable":1,"genTime":"Dec 25, 2019 2:43:43 PM","loginTime":"十二月 25, 2019","lastLoginTime":"Dec 25, 2019 2:43:43 PM"}
        System.out.println("json序列化之后 == " + json);
        //对象是单个元素
        //User jsonData = JSON.parseObject(json, User.class);
        //System.out.println("json转对象之后 == " + jsonData);
        //System.out.println("User对象 == " + jsonData.getGenTime());
        //System.out.println("User对象 == " + jsonData.getLoginTime());
        //System.out.println("User对象 == " + jsonData.getLastLoginTime());

        User gsonData = new Gson().fromJson(json, User.class);
        System.out.println("json转对象之后 == " + gsonData);
        System.out.println("User对象 == " + gsonData.getGenTime());
        System.out.println("User对象 == " + gsonData.getLoginTime());
        System.out.println("User对象 == " + gsonData.getLastLoginTime());

        //Type listType = new TypeToken<List<User>>(){}.getType();
        //Type listType = new TypeToken<User>(){}.getType();
        //User fromJson = (User) new Gson().fromJson(json, listType.getClass());
        //System.out.println("fromJson..."+fromJson);
    }
}
