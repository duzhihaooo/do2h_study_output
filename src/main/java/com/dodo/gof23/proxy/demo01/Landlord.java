package com.dodo.gof23.proxy.demo01;

//房东
public class Landlord implements Rent{
		
		@Override
		public void rent() {
				System.out.println("出租房屋！");
		}
}