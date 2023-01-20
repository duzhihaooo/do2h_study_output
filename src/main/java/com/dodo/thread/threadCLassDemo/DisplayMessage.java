package com.dodo.thread.threadCLassDemo;
//通过实现Runnable接口创建线程
public class DisplayMessage implements Runnable{
    private String message;

    public DisplayMessage(String message){
        this.message = message;
    }

    public void run(){
        while (true){
            System.out.println("1"+message);
        }
    }
}
