package com.dodo.study.equals;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //关于==
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");   //new String()重新开辟了内存空间

        System.out.println(s1 == s2);   //true
        System.out.println(s1 == s3);   //false
        System.out.println(s2 == s3);   //false






    }


}
