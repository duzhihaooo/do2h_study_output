package com.dodo.practice.test.abstractDemo;

public abstract class Coach {
    public abstract void defend();

    public abstract void attack();
}

class Player extends Coach{
    @Override
    public void defend() {
        System.out.println("注意防守！");
    }

    @Override
    public void attack() {
        System.out.println("发起攻击！");
    }
}