package com.maven.test;

import com.maven.model.User;

/**
 * Created with IntelliJ IDEA.
 * Description: 对象比较
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-05-19 21:03
 */
public class ObjEqualsObj {
    public static void main(String[] args) {
        // 1.创建三个对象
        User user = new User();
        User user1 = new User();
        User user2 = new User();
        // 2.重写hashCode情况下，三个对象彼此相等
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
        System.out.println(user1.equals(user2));
        // 3.三个对象的hashCode值都一样
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        // 4.给对象ID赋值，具有相同ID值的对象，是同一个对象
        user.setUserId(1);
        user1.setUserId(1);
        user2.setUserId(2);
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
        System.out.println(user1.equals(user2));

    }
}
