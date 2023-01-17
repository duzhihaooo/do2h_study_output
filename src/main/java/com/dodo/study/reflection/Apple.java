package com.dodo.study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Apple {
		private int price;

		private int getPrice(){
				this.price = price;
				return price;
		}
		
		private void setPrice(int i){
				this.price = i;
		}
		
		
		
		public static void main(String[] args) throws Exception {
				//正常的调用
				Apple apple = new Apple();
				apple.setPrice(5);
				System.out.println("Apple Price:"+apple.getPrice());
				
				//使用反射调用
				//通过字符串获取Class对象，这个字符串必须带上完整路径名
				Class clz = Class.forName("com.dodo.study.reflection.Apple");
				for (Constructor constructor:clz.getConstructors()){
						System.out.println(constructor);
				}
				Constructor appleConstructor = clz.getConstructor();
				Apple apple1 = (Apple) appleConstructor.newInstance();
				apple1.setPrice(88);
				System.out.println(apple1.getPrice());
				
				
				
				
				
				
				
		
		}
		
}