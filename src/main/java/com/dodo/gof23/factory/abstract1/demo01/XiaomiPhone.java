package com.dodo.gof23.factory.abstract1.demo01;

public class XiaomiPhone implements IphoneProduct{
		
		@Override
		public void start() {
				System.out.println("小米手机开机！");
		}
		
		@Override
		public void shutdown() {
				System.out.println("小米手机关机！");
		}
		
		@Override
		public void callup() {
				System.out.println("小米手机打电话！");
		}
		
		@Override
		public void sendSMS() {
				System.out.println("小米手机发短信！");
		}
}