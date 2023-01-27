package com.dodo.gof23.factory.method.test01;

public class Consumer {
		
		public static void main(String[] args) {
				Car car1 = new WuLingFactory().getCar();
				
				car1.name();
				
				Car car2 = new MobileFactory().getCar();
				car2.name();
				
				
		}
}