package com.dodo.thread.waitAndNotify;

public class TestPC2 {
    public static void main(String[] args) {
        TVShow tvShow = new TVShow();

        new Player(tvShow).start();
        new Audience(tvShow).start();
    }
}

//演员
class Player extends Thread {
    TVShow tvShow;

    Player(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                this.tvShow.play("快乐大本营，天天都开心！");
            } else {
                this.tvShow.play("嘟嘟嘟嘟嘟嘟嘟嘟嘟叭叭叭叭叭叭 ！");
            }
        }
    }
}

//观众
class Audience extends Thread {
    TVShow tvShow;

    Audience(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tvShow.watch();
        }
    }
}

//产品-->节目
class TVShow {
    //表演内容
    String voice;
    //信号灯
    boolean flag = true;

    //表演
    public synchronized void play(String voice) {
        //判断节目是否开始
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //节目开始
        System.out.println("演员表演：" + voice);
        //通知观众观看
        this.notifyAll();//通知唤醒
        this.voice = voice;
        this.flag = !this.flag;
    }

    //观看
    public synchronized void watch() {
        //表演开始了观众等待
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //观众观看
        System.out.println("观众观看：" + voice);
        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;
    }


}












