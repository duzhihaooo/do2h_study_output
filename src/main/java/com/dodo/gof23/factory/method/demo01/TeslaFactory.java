package com.dodo.gof23.factory.method.demo01;

public class TeslaFactory implements CarFactory{
		
		@Override
		public Car getCar() {
				return new Tesla();
		}
}