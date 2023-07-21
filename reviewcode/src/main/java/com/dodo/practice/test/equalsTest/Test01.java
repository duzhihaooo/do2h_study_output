package com.dodo.practice.test.equalsTest;

import javax.swing.plaf.InternalFrameUI;
import java.lang.annotation.Inherited;

public class Test01 {
    public static void main(String[] args) {
        Integer x = new Integer(1);
        Integer y = new Integer(1);


        System.out.println(x.equals(y));    //true
        System.out.println(x == y);     //false
        System.out.println(x.hashCode() == y.hashCode());   //true

    }
}