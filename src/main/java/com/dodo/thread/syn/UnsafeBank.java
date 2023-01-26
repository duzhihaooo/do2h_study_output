package com.dodo.thread.syn;

//不安全取钱
//两个人去银行取钱，账户
public class UnsafeBank {
    public static void main(String[] args) {
        //账户
        Account marry = new Account(1000, "结婚资金");

        Drawing boy = new Drawing(marry,50,"me");
        Drawing girl = new Drawing(marry,100,"wife");

        boy.start();
        girl.start();
    }
}

//账户
class Account{

    int money;  //余额
    String cardName;//卡名

    public Account(int money,String cardName){
        this.money = money;
        this.cardName = cardName;
    }


}

//模拟取款
class Drawing extends Thread{
    Account account;    //账户
    int drawMoney;  //取了多少钱
    int nowMoney;    //卡名字

    public Drawing(Account account,int drawMoney,String name){
        super(name);
        this.account = account;
        this.drawMoney = drawMoney;
    }

    //取钱
    //synchronized  默认锁的是this
    @Override
    public void run() {
        //锁的变量就是变化的量，需要增删改的对象
        synchronized (account){
            if (account.money - drawMoney < 0){
                System.out.println(Thread.currentThread().getName()+"：余额不足");
                return;
            }

            //sleep可以放大问题的发生性
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //卡内余额
            account.money = account.money - drawMoney;
            //手里有多少钱
            nowMoney = nowMoney + drawMoney;

            System.out.println(this.getName()+"取了"+drawMoney+"  余额为："+account.money);
            //Thread.currentThread().getName = this.getName()
            System.out.println(this.getName()+"手中的钱："+nowMoney);

        }

    }
}
