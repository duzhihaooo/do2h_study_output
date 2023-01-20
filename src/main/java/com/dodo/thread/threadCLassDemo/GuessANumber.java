package com.dodo.thread.threadCLassDemo;
//通过继承Thread类创建接口
public class GuessANumber extends Thread{
    protected int number;

    public GuessANumber(int number){
        this.number = number;
    }

    public void run(){
        int count = 0;
        int guess = 0;
        //todo:do while有点搞忘了
        do {
            guess = (int) (Math.random()*100+1);
            //todo:this.getName() 又是怎么得到的
            System.out.println(this.getName()+" guesses "+guess);
            count++;
        } while (guess != number);
        System.out.println("** Correct!"+this.getName()+"in"+count+"guesses.**");
    }

}
