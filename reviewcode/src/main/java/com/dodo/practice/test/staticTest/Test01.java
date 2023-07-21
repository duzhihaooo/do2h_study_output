package com.dodo.practice.test.staticTest;

public class Test01 {
    public static void main(String[] args) {
        String name;
        int age;
        String text;
        final Person x = new Person();
        //实例
        name = x.name;
        age = x.age;

        text = Person.introduce;

        System.out.println(name);
        System.out.println(age);
        System.out.println(text);



    }
}