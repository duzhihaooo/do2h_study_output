package com.dodo.gof23.adapter.text;

public class Computer {
		
		private void net(NetToUsb netToUsb){
				netToUsb.handleRequest();
		}
		
		public static void main(String[] args) {
				final LineTest lineTest = new LineTest();
				final Adapter  adapter  = new Adapter(lineTest);
				final Computer computer = new Computer();
				
				computer.net(adapter);
				
				
		}
		
}