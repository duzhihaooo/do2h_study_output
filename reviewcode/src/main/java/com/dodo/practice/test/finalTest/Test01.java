package com.dodo.practice.test.finalTest;

public class Test01 extends A {
    public static void main(String[] args) {
        final int x = 2;
        //Cannot assign a value to final variable 'x'
        //x = 5;
        A demo = new A();
        demo.x = 5;
        System.out.println(demo.x);
    }
}

class A {
    int x = 0;
}