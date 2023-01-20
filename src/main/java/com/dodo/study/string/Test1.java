package com.dodo.study.string;

public class Test1 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String s1 = "HELLO";
        String s2 = "hello".toUpperCase();
        System.out.println(s1 == s2);   //false
        System.out.println(s1.equals(s2)); //true

        String s3 = "hello";
        System.out.println(s1.equalsIgnoreCase(s3));//true







    }
}
