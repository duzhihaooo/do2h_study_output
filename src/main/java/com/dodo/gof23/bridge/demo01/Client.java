package com.dodo.gof23.bridge.demo01;

public class Client {
		
		public static void main(String[] args) {
				final Desktop desktop = new Desktop(new Apple());
				desktop.info();
				System.out.println();
				
				final Laptop laptop = new Laptop(new Lenovo());
				laptop.info();
				System.out.println();
				
				final Taketop taketop = new Taketop(new Dell());
				taketop.info();
				
		}
		
}