package com.maven.test.thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgz
 * Date: 2020-01-07
 * Time: 14:49
 */
public class SubThread implements Runnable {
    static int end = 0;
    static int start = 0;

    @Override
    public void run() {
        try {
            System.out.println("subThread run..." + start);
            start++;
            Thread.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("Exception...");
            e.printStackTrace();
        } finally {
            System.out.println("subThread stop ..." + end);
            end++;
        }
    }
}
