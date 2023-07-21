package com.dodo.practice.test.superTest2;

public class BNum extends ANum{
    int i;
    public BNum(int a,int b){
        super.i = a;
        this.i = b;
    }

    void show(){
        System.out.println("i in superClass:"+super.i);
        System.out.println("i in subClass:"+this.i);
    }
}