package com.dodo.practice.base;

public class Demo03 {
    //类变量   static
    static double salary = 2500;

    //修饰符，不存在先后顺序
    static final double PI = 3.14;

    //属性：变量

    //实例变量：从属于对象；如果不自信初始化，这个类型默认值 0 0.0 null
    //布尔值：默认是false
    //除了基本数据类型，其余默认都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名 = new Demo03();
        Demo03 demo03 = new Demo03();
        System.out.println(demo03.age);
        System.out.println(demo03.name);

        //类变量   static
        System.out.println(salary);

        System.out.println(PI);

    }

    //其他方法
    public void add(){

    }




}