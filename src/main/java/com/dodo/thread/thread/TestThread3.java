package com.dodo.thread.thread;
//创建线程方式2：实现Runnable接口，重写run方法，执行线程需要丢人runnable接口实现类，调用start()方法
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable接口Runnable接口Runnable接口Runnable接口Runnable接口："+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TestThread3 testThread3 = new TestThread3();
        //创建线程对象，通过线程对象来开启我们的线程，代理
//        Thread thread = new Thread(testThread3);
//        thread.start();

        new Thread(testThread3).start();


        for (int i = 0; i <1000; i++) {
            System.out.println("线程1："+i);
        }


    }


}
