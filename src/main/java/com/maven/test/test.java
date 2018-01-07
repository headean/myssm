package com.maven.test;

public class test {
    public static void main(String[] args) {
        System.out.println("main method...");

        //创建三个线程对象,模拟三个窗口
        SellTickets tickets1 = new SellTickets("dage");
        SellTickets tickets2 = new SellTickets("erge");
        SellTickets tickets3 = new SellTickets("sange");

        //开启线程售票
        tickets1.run();
        tickets2.run();
        tickets3.run();
    }
}
