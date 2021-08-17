package com.maven.test.interview2021.a_equals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-17 11:40
 * @author input
 */
public class EqualsAndCompare {

    public static void main(String[] args) {
        // 1.基本类型数据
        // byte,short,char,int,long,float,double,boolean 他们之间的比较应该使用（==），比较的是他们的值。
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3.equals(s1)); // true

        // 2.引用类型数据
        // a.当使用 == 比较的时候，比较的是 他们在内存中的存放地址。
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);//true

        // b.当使用 equals 比较时，这个方法的初始行为是比较对象在堆内存中的地址。
        //equals()方法在object类中定义如下：
        //public boolean equals(Object obj) {
        //    return (this == obj);
        //}

    }
}
