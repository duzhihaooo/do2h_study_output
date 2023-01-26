package com.dodo.gof23.factory.simple;
//静态工厂模式

//开闭原则
public class CarFactory {
		//简单工厂模式
		//方法一
		public static Car getCar(String name){
				if (name.equals("五菱宏光")){
						return new WuLing();
				} else if (name.equals("特斯拉")) {
						return new Tesla();
				} else {
						return null;
				}
		}
		
		//方法二
		public static Car getWuLing(){
				return new WuLing();
		}
		
		public static Car getTesla(){
				return new Tesla();
		}
		
		
}