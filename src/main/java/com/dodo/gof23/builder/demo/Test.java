package com.dodo.gof23.builder.demo;

public class Test {
		
		public static void main(String[] args) {
				final Director director = new Director();
				
				//指挥 具体的工人完成 产品
				final Product build = director.build(new Worker());
				
				System.out.println(build.toString());
				
		}
}