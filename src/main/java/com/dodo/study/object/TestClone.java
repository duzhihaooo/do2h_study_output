package com.dodo.study.object;

import java.rmi.NoSuchObjectException;
import java.util.StringJoiner;

public class TestClone implements Cloneable  {
		
		//声明变量
		String name;
		int age;
		
		@Override
		public String toString() {
				return new StringJoiner(", ", TestClone.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.add("age=" + age)
						.toString();
		}
		
		public static void main(String[] args) {
				//创建对象
				TestClone person = new TestClone();
				
				//初始化变量
				person.name = "noob";
				person.age = 20;
				
				System.out.println(person);
				
				try {
						//创建拷贝
						TestClone person2 = (TestClone) person.clone();
						System.out.println(person2);
				} catch (Exception e){
						System.out.println(e);
				}
				
				
		}
}