package com.dodo.gof23.adapter.text;

public class Adapter implements NetToUsb{
		
		private LineTest lineTest;
		Adapter(LineTest lineTest){
				this.lineTest = lineTest;
		}
		
		@Override
		public void handleRequest() {
				lineTest.request();
		}
}