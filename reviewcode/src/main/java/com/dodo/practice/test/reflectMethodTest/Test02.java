package com.dodo.practice.test.reflectMethodTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws Exception {
        final Dog dog = new Dog();
        //拿到该类的Class
        final Class<? extends Dog> aClass = dog.getClass();
        //getDeclaredMethod获取的是类自身声明的方法，包含public、protected和private方法。
        //getMethod获取的是类的所有public方法，包括自身的和从父类、接口继承的。
        final Method setName = aClass.getDeclaredMethod("setName", String.class);
        //打开权限
        setName.setAccessible(true);
        setName.invoke(dog, "小黑");

        System.out.println(dog.getName());

    }
}