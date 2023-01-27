package com.dodo.gof23.factory.abstract1.test01;

public class AppleIphone implements IphoneProduct{
		
		@Override
		public void start() {
				System.out.println("iPhone开机！");
		}
		
		@Override
		public void shutdown() {
				System.out.println("iPhone关机！");
		}
		
		@Override
		public void callup() {
				System.out.println("iPhone打电话！");
		}
		
		@Override
		public void sendSMS() {
				System.out.println("iPhone发信息！");
		}
}