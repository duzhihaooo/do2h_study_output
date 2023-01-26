package com.dodo.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket).start();
        new Thread(buyTicket).start();
        new Thread(buyTicket).start();
    }
}

class BuyTicket implements Runnable {

    int ticketNums = 10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticketNums > 0) {
                    System.out.println(Thread.currentThread().getName() + "  " + ticketNums--);
                } else {
                    break;
                }

            } finally {
                lock.unlock();
            }

        }

    }
}
