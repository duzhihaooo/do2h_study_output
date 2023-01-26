package com.dodo.gof23.adapter.demo;

//真正的适配器    需要连接usb，连接网线
public class Adapter extends LineTest implements NetToUsb{
		
		@Override
		public void handleRequest() {
				super.request();
		}
}