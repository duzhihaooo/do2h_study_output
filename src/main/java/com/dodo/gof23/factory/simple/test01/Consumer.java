package com.dodo.gof23.factory.simple.test01;

public class Consumer {
		
		public static void main(String[] args) {
				Car car1 = CarFactory.getCar("五菱宏光");
				Car car2 = CarFactory.getCar("特斯拉");
				
				car1.name();
				car2.name();
				
				Car car3 = CarFactory.getWuLing();
				Car car4 = CarFactory.getTesla();
				
				car3.name();
				car4.name();
				
		}
}