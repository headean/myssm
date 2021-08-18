package com.maven.test.interview2021.a.e_hashcode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-18 11:14
 */
public class HashCodeAndEquals {
    public static void main(String[] args) {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
