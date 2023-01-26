package com.dodo.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TestSleep2 {
    public static void main(String[] args) {
        //打印当前时间
        Date startTime = new Date(System.currentTimeMillis());
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(new SimpleDateFormat("HH-mm-ss").format(startTime));
            startTime = new Date(System.currentTimeMillis());   //更新当前时间

        }
    }

    public static void tenDown() throws InterruptedException {
        int i = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(i);
            i--;
            if (i <= 0){
                break;
            }
        }
    }

}
