package com.dodo.gof23.proxy.demo01;

public class Client {
		
		public static void main(String[] args) {
				//房东要出租房子
				final Landlord landlord = new Landlord();
				
				//代理 中介帮房东出租房子，还可以又附属操作
				final Proxy proxy = new Proxy(landlord);
				//不用面对房东
				proxy.rent();
				
		}
		
}