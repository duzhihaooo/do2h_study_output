package com.dodo.thread.waitAndNotify;

//测试：生产者消费者模型---->利用缓冲区解决：管程法

//生产者、消费者、产品、缓冲区
public class TestPC {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();

        new Product(synContainer).start();
        new Consumer(synContainer).start();
    }
}

//生产者
class Product extends Thread{
    SynContainer synContainer;

    Product(SynContainer synContainer){
        this.synContainer = synContainer;//todo
    }
    //生产
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synContainer.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}

//消费者
class Consumer extends Thread{
    SynContainer synContainer;
    Consumer(SynContainer synContainer){
        this.synContainer = synContainer;
    }
    //消费
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+synContainer.take().id+"只鸡");
        }
    }
}

//产品
class Chicken {
    int id;
    Chicken(int id){
        this.id = id;
    }
}

//缓冲区
class SynContainer{
    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //判断容器满了，就需要等待消费者消费
        if (count == chickens.length){
            try {
                System.err.println("count:"+count);
                //通知消费者消费，生产等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有满，我们就需要丢入产品
        chickens[count] = chicken;  // TODO: 2023/1/23
        count++;

        //通知消费者消费
        this.notifyAll();
    }

    //消费者消费产品
    public synchronized Chicken take(){
        //判断有没有鸡
        if (count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果有鸡，可以消费
        count--;
        Chicken chicken = chickens[count];

        //吃完了通知生产
        this.notifyAll();
        return chicken;










    }







}