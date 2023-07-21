package com.dodo.practice.test.reflectMethodTest;


import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws Exception{
        //通过类.class拿到该类的Class
        final Class animalClass = Animal.class;
        //通过该Class拿到该方法
        //getDeclaredMethod获取的是类自身声明的方法，包含public、protected和private方法。
        //getMethod获取的是类的所有public方法，包括自身的和从父类、接口继承的。
        final Method setName = animalClass.getDeclaredMethod("setName", String.class);

        //创建一个对象
        final Animal dog = new Animal();
        //打开权限
        setName.setAccessible(true);
        //通过该方法的invoke()功能设置属性
        setName.invoke(dog, "小黑");

        System.out.println(dog.getName());


    }
}

class Animal {
    private String name;
    private void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public Animal(){}
}