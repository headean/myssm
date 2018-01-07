package com.maven.test;

public class SellTickets implements Runnable{
    /**
     * 票数 这里 必须定义为static。
     * 不然   非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的。
     * 三个线程对象就会有三份。
     */
    private static int tickets=1;
    private String name;

    public SellTickets(String name) {
        this.name = name;
    }

    public void run() {
        while(true) {
            synchronized (this) { // synchronized ("锁") {
                if (tickets == 101) {//或者 if(tickets>100){
                    System.out.println(this+"票已经卖完啦-_-...");
                    break;
                }

                // System.out.println(Thread.currentThread().getName()+"卖了第"+tickets+"号票");
                System.out.println(this+"卖了第"+tickets+"号票");
                tickets++;
            }
        }
    }
}
