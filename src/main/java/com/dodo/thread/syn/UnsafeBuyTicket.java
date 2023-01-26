package com.dodo.thread.syn;

//不安全买票
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"我").start();
        new Thread(buyTicket,"你们").start();
        new Thread(buyTicket,"黄牛党").start();

    }
}

class BuyTicket implements Runnable {
    //票数
    int ticketNums = 10;
    boolean flag = true;    //  外部停止方式


    //synchronized  同步方法，锁的是this
    @Override
    public synchronized void  run() {
        //买票
        while (flag){
            buy();
        }
    }

    public void buy() {
        //判断是否有票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }
        //模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //买票
        System.out.println(Thread.currentThread().getName() + "买到第" + ticketNums--);

    }

}