package com.dodo.gof23.adapter.demo;

//客户端类：想上网，插不上网线
public class Computer {
		
		//我们的电脑需要连接上转换器才可以上网
		public void net(NetToUsb netToUsb){
				//上网的具体实现：找一个转接头
				netToUsb.handleRequest();
		}
		
		public static void main(String[] args) {
				final LineTest lineTest = new LineTest();//网线
				final Adapter  adapter  = new Adapter();//转换器
				final Computer computer = new Computer();//电脑
				
				computer.net(adapter);
				
				final Adapter2 adapter2 = new Adapter2(lineTest);
				computer.net(adapter2);
				
				
		}
		
}