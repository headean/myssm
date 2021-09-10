package com.maven.test.thread;

/**
 * Created with IntelliJ IDEA.
 * Description: join方法的作用
 *              thread.join()方法用于把指定的线程加入到当前线程中，把当前线程的CPU执行时间让给另一个线程。
 *              比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
 *              threadA.join();      //把当前线程执行时间让给threadA线程，直到threadA执行完毕才会继续执行当前线程
 *              threadA.join(1000);  //把当前线程执行时间让给threadA线程，1000毫秒后，A、B两个线程再重新竞争
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-09-10 11:35
 */
public class ThreadJoinTest extends Thread{
    public static int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 999999999; i++) {
            a = a + i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * 因为t.start()只是让线程进入了RUNNABLE状态，但并不一定在1毫秒内执行到t线程的run方法。
         * 如果没有走进t线程的run方法，直接执行了主线程的打印语句，则输出结果为0；
         * 如果进入了t线程的run方法，并且在1毫秒内将t线程的run方法执行完毕，则输出结果为100000；
         * 否则，可能是0~100000之间的任意数字。因此最终答案不能确定
         */
//        ThreadJoinTest threadJoinTest = new ThreadJoinTest();
//        threadJoinTest.start();
//        threadJoinTest.join(1);
//        System.out.println(a);

        ThreadJoinTest threadJoinTest1 = new ThreadJoinTest();
        ThreadJoinTest threadJoinTest2 = new ThreadJoinTest();

        threadJoinTest1.start();
        System.out.println(a);

        threadJoinTest2.join(2000);
        System.out.println(a);

        threadJoinTest1.sleep(3000);
        System.out.println(a);

//        threadJoinTest1.wait();
//        System.out.println(a);
//
//        threadJoinTest1.notify();
//        System.out.println(a);

    }
}
