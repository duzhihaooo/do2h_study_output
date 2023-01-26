package com.dodo.gof23.bridge.demo01;

public class Apple implements Brand{
		
		@Override
		public void info() {
				System.out.print("Apple");
		}
}