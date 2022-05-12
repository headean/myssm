package com.maven.test.string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2022-03-26 21:45
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = new String("abc");
        StringBuilder builder = new StringBuilder(s);
        builder.append("d");
        System.out.println(builder);
        StringBuffer buffer = new StringBuffer(s);
        buffer.append("d");
        System.out.println(buffer);

    }
}
