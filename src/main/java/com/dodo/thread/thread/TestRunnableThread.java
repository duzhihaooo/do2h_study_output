package com.dodo.thread.thread;
/*
* 通过实现 Runnable 接口来创建线程
* */
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating:"+threadName);
    }

    public void run(){
        System.out.println("Running:"+threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread:"+threadName+","+i);
            //让线程睡眠一会   todo:为什么要睡一会
            //todo：这里的Thread可以用t来代替吗
            Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread:"+threadName+"interrupted.");
        }
        System.out.println("Thread:"+threadName+"exiting.");
    }

    //public void start()
    //使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
    public void start(){
        System.out.println("Starting:"+threadName);
        if (t == null){
            // TODO: 2023/1/20 为什么start里有个判断
            t = new Thread(this,threadName);    //todo:this又代表什么
            t.start();
        }
    }

}

public class TestRunnableThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();


        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();









    }
}