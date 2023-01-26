package com.dodo.thread.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    public static void main(String[] args) {
        //1.创建服务，创建线程池
        //newFixedThreadPool    参数为：线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        //执行
        service.execute(new MyThreadPool());
        service.execute(new MyThreadPool());
        service.execute(new MyThreadPool());
        service.execute(new MyThreadPool());

        //2.关闭链接
        service.shutdown();



    }
}

class MyThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
