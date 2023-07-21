package com.dodo.practice.test.reflectTest;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public class Test01 {
    public static void main(String[] args) throws Exception {
        final Student stu = new Student("kiki",98,22);

        final Class stuClass = stu.getClass();
        final Field f = stuClass.getField("name");
        f.set(stu, "Bruce");
        System.out.println(stu);



    }
}

class Student extends Person{
    public int score;
    private int age;

    public Student(String name,int score, int age) {
        super.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("score=" + score)
                .add("age=" + age)
                .add("name='" + name + "'")
                .toString();
    }
}
class Person{
    public String name;

}