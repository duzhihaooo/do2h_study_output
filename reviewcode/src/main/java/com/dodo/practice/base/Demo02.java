package com.dodo.practice.base;

public class Demo02 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;  //内存溢出 byte:-128 ~ 127

        System.out.println(i);
        System.out.println(b);
        System.out.println("------------------");

        //转换的时候可能存在内存溢出或者精度问题
        System.out.println((int)23.7);
        System.out.println((int)-45.789f);
        System.out.println("------------------");


        //操作比较大的数的时候，注意溢出问题
        int salary = 1000000000;
        int months = 20;

        int total = salary * months;    //默认就是int
        long total2 = salary * ((long)months);//先把一个数转换为long

        System.out.println(total);  //-1474836480   计算的时候溢出
        System.out.println(total2); //20000000000


    }
}