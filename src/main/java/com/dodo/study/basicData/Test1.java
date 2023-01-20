package com.dodo.study.basicData;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;  //分配空间
        Integer a1 = 1; //分配引用空间    自动装箱
        Integer b1 = Integer.valueOf(a);//自动装箱
        int b = a1.intValue();
        System.out.println(b1);
        System.out.println(b);
        a = a1;
        System.out.println(a);


        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

        System.out.println("----------------");

        int k1 = 100;
        int k2 = 100;
        int k3 = 200;
        int k4 = 200;
        System.out.println(k1==k2);
        System.out.println(k3==k4);




    }
}
