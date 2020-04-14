package com.maven.test.Dblock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description: dblock test
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-03-13 14:26
 */
public class StockTest {
    /**
     * can use spring help new Dblock
     */
    @Autowired
    private static Dblock dblock;

    static {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dblock = classPathXmlApplicationContext.getBean(Dblock.class);
    }

    static class StockThread implements Runnable {
        @Override
        public void run() {
            // lock up
            dblock.lock();

            // decrease stock
            System.out.println("run...");
            boolean b = new stock().decreaseStock();

            // lock down
            dblock.unlock();

            if (b) {
                System.out.println("stock decrease...");
            } else {
                System.out.println("stock add...");

            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StockThread(),"线程1");
        Thread thread2 = new Thread(new StockThread(),"线程2");

        // start thread
        thread1.start();
        thread2.start();
    }
}
