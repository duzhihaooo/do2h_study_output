package com.dodo.gof23.factory.abstract1.demo01;

public class Client {
		
		public static void main(String[] args) {
				System.out.println("----小米发布会----");
				final XiaomiFactory xiaomiFactory = new XiaomiFactory();
				System.out.println("小米手机功能：");
				final IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
				iphoneProduct.start();
				iphoneProduct.shutdown();
				iphoneProduct.callup();
				iphoneProduct.sendSMS();
				
				System.out.println("小米路由器功能：");
				final IRouterProduct iRouterProduct = xiaomiFactory.iRouterProduct();
				iRouterProduct.openWifi();
				iRouterProduct.setting();
				
				System.out.println("----华为发布会----");
				final HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
				System.out.println("华为手机：");
				final IphoneProduct iphoneProduct1 = huaWeiFactory.iphoneProduct();
				iphoneProduct1.start();
				iphoneProduct1.sendSMS();
				
				System.out.println("华为路由器：");
				final IRouterProduct iRouterProduct1 = huaWeiFactory.iRouterProduct();
				iRouterProduct1.setting();
				
				
		}
}