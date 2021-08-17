package com.maven.test;

import com.maven.model.Student;
import com.maven.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: hashCode高位运算测试
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-13 11:30
 */
public class hashCodeTest {
    private static Map m = new HashMap();

    static final int hash(Object key) {// 11
        int h = 0;// 1568
        if ((key != null)) {
            h = key.hashCode();// 1568
            int m = h >>> 16;//
            System.out.println(m);
            //(key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        }
        return h;
    }

    public static void main(String[] args) {
        m.put("1", "1");
        m.put("2", "2");
        m.put("4", "4");
        m.put("9", "4");
        m.put("3", "3");
        m.put("8", "8");
        m.put("9", "9");
        m.put("10", "10");
        m.put("11", "11");
        m.put("18", "8");
        m.put("28", "8");
        m.put("38", "8");
        //
        //System.out.println(m.size());
        //System.out.println(m.keySet().size());
        ////String s = (String) m.get(1);
        ////System.out.println(s);
        //
        ////int i = m.get(1).hashCode();
        //System.out.println(m.get("1").hashCode());
        //System.out.println(m.get("2").hashCode());
        //System.out.println(m.get("4").hashCode());
        //System.out.println(m.get("9").hashCode());
        //System.out.println(m.get("3").hashCode());
        //System.out.println(m.get("8").hashCode());

        //m.put(1, "1");
        //m.put(2, "2");
        //m.put(4, "4");
        //m.put(9, "4");
        //m.put(3, "3");
        //m.put(8, "8");

        System.out.println(m.size());

        //String s = (String) m.get(1);
        //System.out.println(s);

        //int i = m.get(1).hashCode();
        //遍历map中的键
        for (Object key : m.keySet()) {
            System.out.println("Key = " + key.toString());
            int hash = hash(key);
            System.out.println(key.hashCode());
        }
        //遍历map中的值
        for (Object value : m.values()) {
            System.out.println("Value = " + value.toString());
            System.out.println(value.hashCode());
        }

        //System.out.println(m.get(1).hashCode());
        //System.out.println(m.get(2).hashCode());
        //System.out.println(m.get(4).hashCode());
        //System.out.println(m.get(9).hashCode());
        //System.out.println(m.get(3).hashCode());
        //System.out.println(m.get(8).hashCode());

        //int hash = hash("1");
        //System.out.println(hash);
        //
        //User user = new User();
        //User user1 = new User();
        //User user2 = new User();
        //
        //System.out.println(user.hashCode());
        //System.out.println(user1.hashCode());
        //System.out.println(user2.hashCode());
        //
        //user.setUserId(1);
        //user1.setUserId(2);
        //user2.setUserId(1);
        //
        //System.out.println(user.equals(user1));
        //System.out.println(user.equals(user2));
        //System.out.println(user2.equals(user1));
        //
        //m.put("user", user);
        //m.put("user1", user1);
        //m.put("user2", user2);
        //
        //System.out.println(m.get("user").hashCode());
        //System.out.println(m.get("user1").hashCode());
        //System.out.println(m.get("user2").hashCode());
        //
        //System.out.println(m.get("user").equals(m.get("user1")));
        //System.out.println(m.get("user").equals(m.get("user2")));
        //
        //Student s1 =new Student();
        //s1.setAddr("1111");
        //s1.setAge("20");
        //s1.setName("allan");
        //s1.setSex("male");
        //s1.setWeight(60f);
        //
        //Student s2 =new Student();
        //s2.setAddr("222");
        //s2.setAge("20");
        //s2.setName("allan");
        //s2.setSex("male");
        //s2.setWeight(70f);
        //
        //if (s1.equals(s2)) {
        //    System.out.println("s1==s2");
        //} else {
        //    System.out.println("s1 != s2");
        //}
        //
        //m.put("student1", s1);
        //m.put("student2", s2);
        //
        //System.out.println(m.get("student1").hashCode());
        //System.out.println(m.get("student1").hashCode());
        //
        //System.out.println(m.get("student1"));
        //System.out.println(m.get("student2"));


    }

}
