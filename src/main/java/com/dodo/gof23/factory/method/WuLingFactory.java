package com.dodo.gof23.factory.method;

public class WuLingFactory implements CarFactory{
		
		@Override
		public Car getCar() {
				return new WuLing();
		}
}