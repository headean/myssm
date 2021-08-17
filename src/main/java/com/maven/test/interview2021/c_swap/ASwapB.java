package com.maven.test.interview2021.c_swap;

/**
 * Created with IntelliJ IDEA.
 * Description: 不借助中间变量交换两个变量的值
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-17 16:26
 */
public class ASwapB {
    //int a = 5, b = 10;

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // 使用异或操作交换
        a = a ^ b;// 00000101 ^ 00001010 = 00001111
        b = a ^ b;// 00001111 ^ 00001010 = 00000101
        a = a ^ b;// 00001111 ^ 00000101 = 00001010

        //int key = 15;
        //int h = 181;
        //int m = key >>> h;
        //int z = 181 ^ 15;
        //System.out.println(z);
    }
}
