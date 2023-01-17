package com.dodo.study.tryCatch;

public class Test1 {
		
		public int method(){
				int x = 1;
				try {
						++x;
						System.out.println("try:"+x);
						return x;
				} catch (Exception e){
						e.printStackTrace();
				} finally {
						++x;
						System.out.println("finally"+x);
				}
				return x;
		}
		
		public static void main(String[] args) {
				Test1 test1 = new Test1();
				int y = test1.method();
				System.out.println(y);
		}
}