package com.dodo.thread.thread;

//多个线程同时操作同一个对象
//买火车票

//发现问题：多个线程同时操作同一个资源的情况下
public class TestThread4 implements Runnable{
    //票数
    private int tickerNums=10;
    @Override
    public void run() {

        while (true){
            if (tickerNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ tickerNums-- +"张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();

        new Thread(testThread4,"dodo").start();
        new Thread(testThread4,"老师").start();
        new Thread(testThread4,"黄牛党").start();

    }
}
