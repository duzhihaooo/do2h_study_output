package com.dodo.gof23.builder.demo2;

public class Worker extends Builder{
		
		private Product product;
		
		public Worker(){
				product = new Product();
		}
		
		
		@Override
		Builder buildHamburger(String msg) {
				product.setHamburger(msg);
				return this;
		}
		
		@Override
		Worker buildChips(String msg) {
				product.setChips(msg);
				return this;
		}
		
		@Override
		Worker buildCola(String msg) {
				product.setCola(msg);
				return this;
		}
		
		@Override
		Worker buildDessert(String msg) {
				product.setDessert(msg);
				return this;
		}
		
		@Override
		Product getProduct() {
				return product;
		}
}