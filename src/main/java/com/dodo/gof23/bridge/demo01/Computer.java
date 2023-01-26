package com.dodo.gof23.bridge.demo01;

import com.dodo.gof23.builder.demo2.Product;

public abstract class Computer {
		//组合，品牌
		protected Brand brand;
		
		Computer(Brand brand){
				this.brand = brand;
		}
		
		public void info(){
				brand.info();
		}
}

class Desktop extends Computer{
		
		Desktop(Brand brand) {
				super(brand);
		}
		
		@Override
		public void info() {
				super.info();
				System.out.print("台式机");
		}
}

class Laptop extends Computer {
		
		Laptop(Brand brand) {
				super(brand);
		}
		
		@Override
		public void info() {
				super.info();
				System.out.print("笔记本");
		}
		
}

class Taketop extends Computer{
		
		Taketop(Brand brand) {
				super(brand);
		}
		
		@Override
		public void info() {
				super.info();
				System.out.print("手提电脑");
		}
}