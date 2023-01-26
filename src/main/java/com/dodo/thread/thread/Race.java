package com.dodo.thread.thread;
//模拟龟兔赛跑
public class Race implements Runnable {
    private static String winner;

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            //模拟兔子休息
            if (Thread.currentThread().getName().equals("兔兔") && i % 10 == 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            //判断比赛结束
            boolean flag = gameOver(i);
            //如果比赛结束，停止程序
            if (flag) {
                break;
            }


            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }

    //判断是否完成比赛
    private Boolean gameOver(int steps) {
        //判断是否有胜利者
        if (winner != null) {    //已经有胜利者
            return true;
        }
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔兔").start();
        new Thread(race, "龟龟龟龟").start();
    }
}
