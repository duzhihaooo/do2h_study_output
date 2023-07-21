package com.dodo.practice.test.reflectConstructorTest;

import com.dodo.practice.test.staticTest.Person;

import javax.lang.model.element.Name;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws Exception {
        final Dog a = new Dog();
        a.setName("小黑");
        System.out.println("狗狗：" + a.name);

        //拿到a的Class
        final Class aClass = a.getClass();
        //再拿到该class的构造器创建新的对象
        final Constructor constructor = aClass.getConstructor();
        //通过构造器的newInstance()方法创建对象
        final Object o = constructor.newInstance();

        //通过拿到的Class找到类的set方法 设置属性
        final Method setName = aClass.getMethod("setName", String.class);
        //打开权限
        setName.setAccessible(true);
        //通过方法的invoke()对对象设置属性
        setName.invoke(o, "可乐");

        //通过拿到的Class找到get方法
        final Method getName = aClass.getMethod("getName");

        System.out.println("狗狗：" + getName.invoke(o));
    }

}

class Dog {
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //需要添加无参构造
    //该主类默认无参构造为 Test01()
    //class Dog() 没有构造方法
    public Dog() {
    }
}