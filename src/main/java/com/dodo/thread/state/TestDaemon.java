package com.dodo.thread.state;

public class TestDaemon {
    public static void main(String[] args) {

        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认是false表示是用户线程，正常的线程都是用户线程
        thread.start(); //上帝线程启动


        new Thread(you).start();//你 用户线程启动




    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("开开心心每一天");
        }
        System.out.println("----结  束----");
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("God Bless Youuuu");
        }
    }
}
