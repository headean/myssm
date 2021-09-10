package com.maven.test.interview2021.b.a_collection;

public class b_BitOperation {
    public static void main(String[] args) {
        int number = 99;
        //原始数二进制
        printInfo(number);
        number = number << 1;
        System.out.println("left..."+number);
        //左移一位
        printInfo(number);
        number = number >> 1;
        System.out.println("right..."+number);
        //右移一位
        printInfo(number);
        number = number >> 1;
        System.out.println("right..."+number);
        number = number >>> 3;
        printInfo(number);
        System.out.println("right..."+number);
    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }
}
