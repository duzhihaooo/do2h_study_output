package com.dodo.practice.test.staticMethodTest;

public class Test01 {
    public static void main(String[] args) {
        Person.setAge(22);
        System.out.println(Person.age);
    }
}

class Person{
    public static int age;

    public static void setAge(int x){
        age = x;
    }

}