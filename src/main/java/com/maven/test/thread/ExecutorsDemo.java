package com.maven.test.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description: google 线程实现
 *              避免OOM的问题，可以自定义线程名称，方便的出错的时候溯源。
 *              https://juejin.im/post/5bd906046fb9a05d3c80496b
 * User: zgz
 * Date: 2020-01-07
 * Time: 14:47
 */
public class ExecutorsDemo {
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("demo-pool-%d").build();


    private static ExecutorService pool = new ThreadPoolExecutor(2, 2,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            pool.execute(new com.maven.test.thread.SubThread());
        }

    }

}
