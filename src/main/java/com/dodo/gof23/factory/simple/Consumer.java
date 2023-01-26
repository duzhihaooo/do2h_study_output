package com.dodo.gof23.factory.simple;

public class Consumer {
		
		public static void main(String[] args) {
		
		//Car car1 = new WuLing();
		//Car car2 = new Tesla();
		//
		//car1.name();
		//car2.name();
		
		Car car1 = CarFactory.getCar("五菱宏光");
		Car car2 = CarFactory.getCar("特斯拉");
		
		
		car1.name();
		car2.name();
				System.out.println("----方法二----");
		Car car3 = CarFactory.getWuLing();
		Car car4 = CarFactory.getTesla();
		
		car3.name();
		car4.name();
		
		
		
		}
		
		
		
		
}