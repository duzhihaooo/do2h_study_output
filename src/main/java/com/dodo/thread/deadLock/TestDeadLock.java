package com.dodo.thread.deadLock;

public class TestDeadLock {
    public static void main(String[] args) {
        Makeup girl1 = new Makeup(0, "漂亮美眉");
        Makeup girl2 = new Makeup(1, "成都靓女");

        girl1.start();
        girl2.start();
    }
}

//口号
class Lipstick {

}

//镜子
class Mirror {

}

class Makeup extends Thread {
    int choice;
    String girlName;
    //需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipstick) {// 获得口红的锁
                System.out.println(this.girlName + "先想用口红");

                Thread.sleep(1000);
            }

            synchronized (mirror) {//   获得镜子的锁
                System.out.println(this.girlName + "再想用镜子");
            }
        } else {
            synchronized (mirror) {//   获得镜子的锁
                System.out.println(this.girlName + "先想用镜子");

                Thread.sleep(2000);
            }

            synchronized (lipstick) {// 获得口红的锁
                System.out.println(this.girlName + "再想用口红");
            }
        }


    }

}




