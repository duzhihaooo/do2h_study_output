package com.dodo.practice.operator;

public class Demo02 {
    public static void main(String[] args) {
        // ++ --    自增，自减   一元运算符
        int a = 3;

        int b = a++;    //先赋值 后自增
        System.out.println(a);
        int c = ++a;    //先自增，后赋值

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}