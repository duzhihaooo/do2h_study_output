package com.dodo.gof23.bridge.demo01;

public class Dell implements Brand{
		
		@Override
		public void info() {
				System.out.print("Dell");
		}
}