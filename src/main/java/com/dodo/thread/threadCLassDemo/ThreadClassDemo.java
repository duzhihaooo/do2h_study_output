package com.dodo.thread.threadCLassDemo;

public class ThreadClassDemo {
    public static void main(String[] args) {
        Runnable hello = new DisplayMessage("Hello");
        //todo:为什么能把Runnable hello放进去
        //public Thread(Runnable target)
        Thread thread1 = new Thread(hello);
        //在线程启动之前
        //调用setDaemon()方法，才能把它设置为后台线程
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Strating hello thread...");
        thread1.start();

        Runnable bye = new DisplayMessage("Goodbye");
        Thread thread2 = new Thread(bye);
        //.setPriority()  更改线程的优先级
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        thread2.start();

        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(27);
        thread3.start();
        try {
            //.join 等待该线程终止的时间最长为 millis 毫秒
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(75);

        thread4.start();
        System.out.println("main() is ending...");


    }
}
