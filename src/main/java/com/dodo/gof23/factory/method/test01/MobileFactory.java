package com.dodo.gof23.factory.method.test01;

public class MobileFactory implements CarFactory{
		
		@Override
		public Car getCar() {
				return new Mobile();
		}
}