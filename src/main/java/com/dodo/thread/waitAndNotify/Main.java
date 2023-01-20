package com.dodo.thread.waitAndNotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        var q = new TaskQueue();    //todo:var又是啥
        var ts = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            var t = new Thread(){
                public void run(){
                    //执行task:
                    while (true){
                        try {
                            String s = q.getTask();
                            System.out.println("execute task:"+s);
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        var add = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                //放入task：
                String s = "t-"+Math.random();
                System.out.println("add task:"+s);
                q.addTask(s);
                try{Thread.sleep(100);}catch (InterruptedException e){}
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        for (var t:ts){
            t.interrupt();
        }



    }
}

class TaskQueue{
    Queue<String> queue = new LinkedList<>();

    // TODO: 如果不添加wait()和notify() 是不是就是死锁现象?
    public synchronized void addTask(String s){
        this.queue.add(s);
        this.notify();  //唤醒在this锁等待的线程
    }

    public synchronized String getTask() throws InterruptedException{
        while (queue.isEmpty()){
            //线程在执行while()循环时，已经在getTask()入口获取了this锁，
            // 其他线程根本无法调用addTask()，
            // 因为addTask()执行条件也是获取this锁
            //使用wait()方法 释放this锁
            this.wait();
        }
        return queue.remove();
    }



}