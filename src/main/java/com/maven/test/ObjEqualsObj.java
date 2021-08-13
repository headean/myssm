package com.maven.test;

import com.maven.model.User;

/**
 * Created with IntelliJ IDEA.
 * Description: 对象比较
 *              hashMap不同key使用hashCode方法可能发生hash值相同，这就出现equals值不确定问题
 *              在java中，对对象的存储采取了存储在哈希表中处理方法，hashcode方法是根据对象的地址转换之后返回的一个哈希值
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
        // hashcode不相同，用equals()方法判断的返回的一定为false。
        // hashcode相同，equals()方法返回值不能确认，可能为true，可能为false。
        // 先根据hashcode进行的判断，相同的情况下再根据equals()方法进行判断。
        // 如果只重写了equals方法，而不重写hashcode的方法，会造成hashcode的值不同，而equals()方法判断出来的结果为true
    }
}
