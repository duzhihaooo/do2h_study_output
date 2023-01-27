package com.dodo.gof23.factory.abstract1.test01;

public class Consumer {
		
		public static void main(String[] args) {
				final HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
				huaWeiPhone.start();
				huaWeiPhone.shutdown();
				huaWeiPhone.callup();
				huaWeiPhone.sendSMS();
				
				System.out.println("我想买个苹果手机和路由器");
				final AppleIphone appleIphone = new AppleIphone();
				final AppleIRouter appleIRouter = new AppleIRouter();
				
				System.out.println("iPhone功能：");
				appleIphone.start();
				appleIphone.shutdown();
				appleIphone.callup();
				appleIphone.sendSMS();
				
				System.out.println("Apple路由器功能：");
				appleIRouter.start();
				appleIRouter.shutdown();
				appleIRouter.openWifi();
				appleIRouter.setting();
				
				
				
				
				
				
				
				
		}
}