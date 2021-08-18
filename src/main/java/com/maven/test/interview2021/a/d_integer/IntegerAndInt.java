package com.maven.test.interview2021.a.d_integer;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-18 10:04
 */
public class IntegerAndInt {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;// 3自动装箱成Integer类型
        int c = 3;

        System.out.println(a == b);// false 两个引用没有引用同一对象
        // 包装类型间的相等判断应该用equals，而不是'=='
        System.out.println(a.equals(b));// 两个引用同一对象
        System.out.println(Objects.equals(a, b));
        System.out.println(a == c);// a自动拆箱成int类型再和c比较
        System.out.println("=================================");

        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);// 整型字面量的值在-128到127之间
    }
}
