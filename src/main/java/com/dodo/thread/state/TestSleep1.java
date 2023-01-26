package com.dodo.thread.state;
//模拟网络延时:放大问题的发生性
public class TestSleep1 implements Runnable{
    //票数
    private int ticketNums = 10;
    @Override
    public void run() {
        while (true){
            if (ticketNums <= 0){
                break;
            }

            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ ticketNums-- +"张票");
        }
    }

    public static void main(String[] args) {
        TestSleep1 testSleep1 = new TestSleep1();

        new Thread(testSleep1,"我").start();
        new Thread(testSleep1,"老师").start();
        new Thread(testSleep1,"黄牛党").start();

    }
}
