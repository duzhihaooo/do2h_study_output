package com.dodo.gof23.adapter.demo;

//2.组合（对象适配器：常用）

//真正的适配器
public class Adapter2 implements NetToUsb{
		
		private LineTest lineTest;
		Adapter2(LineTest lineTest){
				this.lineTest = lineTest;
		}
		
		@Override
		public void handleRequest() {
				lineTest.request();
		}
}