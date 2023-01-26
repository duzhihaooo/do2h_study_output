package com.dodo.gof23.proxy.demo01;

public class Proxy implements Rent{
		private Landlord landlord;
		Proxy(){}
		Proxy(Landlord landlord){
				this.landlord = landlord;
		}
		
		
		@Override
		public void rent() {
				landlord.rent();
				seeHouse();
				fee();
				signContract();
		}
		
		public void seeHouse(){
				System.out.println("看房");
		}
		
		public void fee(){
				System.out.println("收房租");
		}
		
		public void signContract(){
				System.out.println("签署合同");
		}
		
		
		
		
}