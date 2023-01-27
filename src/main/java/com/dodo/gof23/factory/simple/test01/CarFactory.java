package com.dodo.gof23.factory.simple.test01;

public class CarFactory {
		public static Car getCar(String carname){
				if (carname.equals("五菱宏光")){
						return new WuLing();
				} else if (carname.equals("特斯拉")){
						return new Tesla();
				} else {
						return null;
				}
		}
		
		public static Car getWuLing(){
				return new WuLing();
		}
		
		public static Car getTesla(){
				return new Tesla();
		}
		
		
		
}