package com.dodo.gof23.builder.test01;

public class Worker extends Builder{
		
		private Product product;
		
		Worker(){
				//todo：有点不明白
				product = new Product();
		}
		
		@Override
		Builder makeHamburger(String msg) {
				product.setHamburger(msg);
				return this;
		}
		
		@Override
		Builder makeChips(String msg) {
				product.setChips(msg);
				return this;
		}
		
		@Override
		Builder makeCola(String msg) {
				product.setCola(msg);
				return this;
		}
		
		@Override
		Builder makeDessert(String msg) {
				product.setDessert(msg);
				return this;
		}
		
		@Override
		Product getProduct() {
				return product;
		}
}