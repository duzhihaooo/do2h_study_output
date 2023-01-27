package com.dodo.gof23.builder.test01;

public class Consumer {
		
		public static void main(String[] args) {
				final Worker worker = new Worker();
				final Product product = worker.getProduct();
				System.out.println("默认套餐："+product);
				
				final Product productDesign = worker.makeHamburger("安格斯汉堡").makeCola("可口可乐")
						.makeChips("中薯").makeDessert("菠萝派").getProduct();
				System.out.println("定制套餐："+productDesign);
				
		}
}