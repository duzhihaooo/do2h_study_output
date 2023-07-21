package com.dodo.practice.test.reflectConstructorTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Apple {
    private int price;
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public static void main(String[] args) throws Exception {
        //正常调用
        final Apple apple = new Apple();
        apple.setPrice(8);
        System.out.println("ApplePriceOld:"+apple.getPrice());

        //使用反射调用
        Class appleCls = apple.getClass();
        final Method setMethod = appleCls.getMethod("setPrice", int.class);
        //通过得到构造器，创建对象
        Constructor appleClsConstructor = appleCls.getConstructor();
        final Object appleNew = appleClsConstructor.newInstance();
        setMethod.invoke(appleNew, 18);     //相当于appleNew.setPrice(18)

        final Method getMethod = appleCls.getMethod("getPrice");
        System.out.println("ApplePriceNew:"+getMethod.invoke(appleNew)); //相当于appleNew.getPrice()
    }
}