package com.dodo.thread.thread;

public class TestThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程1线程1线程1线程1线程1线程1线程1："+i);
        }
    }

    public static void main(String[] args) {
        //main线程

        //创建一个线程对象
        TestThread1 thread = new TestThread1();
        //调用start()启动线程
        //线程开启不一定立即执行，由CPU调度执行
        thread.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("主代码："+i);
        }

    }

}
