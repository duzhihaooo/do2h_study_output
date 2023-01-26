package com.dodo.gof23.builder.demo2;

public class Test {
		
		public static void main(String[] args) {
				//服务员
				final Worker worker = new Worker();
				final Product product = worker.getProduct();
				
				System.out.println(product);
				
				final Product productDesign = worker.buildHamburger("安格斯汉堡").buildChips("中薯条")
						.buildDessert("菠萝派").getProduct();
				System.out.println(productDesign);
				
		}
		
}