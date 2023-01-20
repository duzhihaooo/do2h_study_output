package com.dodo.study.practice;

public class Test1 {
		
		public static void main(String[] args) {
				
				boolean bool = (0.1*3 == 0.3);
				
				
				System.out.println(bool);
				//因为浮点数不能精确表现出来 所以内存地址也不一样
		
				byte a = 127;
				byte b = 127;
				a += b;	//+=自动转换结果为持有结果
				//a = a+b;	//编译报错

				//a += 1;
			System.out.println(a);



		}
		
}