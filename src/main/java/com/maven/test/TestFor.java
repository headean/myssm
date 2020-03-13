package com.maven.test;
import java.util.Date;

import com.maven.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-09
 * Time: 15:43
 */
public class TestFor {
    public void test(){
        List<User> list =new ArrayList<User>();
        User user;
        for (int i = 0; i < 10; i++) {
            user = new User();
            user.setUserId(i);
            user.setUserNo("");
            user.setUserPwd("");
            user.setUserName("");
            user.setEmail("");
            user.setPhone("");
            user.setEnable(0);
            user.setGenTime(new Date());
            user.setLoginTime(new Date());
            user.setLastLoginTime(new Date());
            user.setLoginCount(0);
            list.add(user);
        }
        System.out.println(list.get(2).getUserId());
        if (list.get(2).getUserId() == 2){
            list.get(2).setUserId(null);
        }

        System.out.println("list --> "+list.toArray().toString());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserId() instanceof Integer){
                System.out.println(list.get(i).getUserId());
            } else {
                try {
                    System.out.println("exception..."+i);
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new TestFor().test();
    }
}
