package com.dodo.thread.thread;

public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();    //你要结婚
        WeddingCompany weddingCompany = new WeddingCompany(you);
        weddingCompany.HappyMarry();
    }
}

interface Marry{

    void HappyMarry();
}
//真实角色，你去结婚
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("我要结婚了");
    }
}
//代理角色，帮你结婚
class WeddingCompany implements Marry{
    //代理谁-->真实目标对象
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        target.HappyMarry();//真实对象
        after();
    }

    private void after() {
        System.out.println("婚礼结之后，收尾款");
    }

    private void before() {
        System.out.println("婚礼之前，布置现场");
    }
}