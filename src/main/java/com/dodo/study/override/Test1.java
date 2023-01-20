package com.dodo.study.override;

class Animal {
    public void move(){
        System.out.println("动物可以行走");
    }
}

class Dog extends Animal{

    @Override
    public void move() {
        super.move();   //应用super类的方法
        System.out.println("狗狗可以走动");
    }

    public void bark(){
        System.out.println("狗狗可以汪汪");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();   //Animal对象
        Animal b2 = new Dog();      //Dog对象
        a1.move();
        b2.move();
        //b2.bark;  b2的引用类型Animal没有bark()方法


    }
}