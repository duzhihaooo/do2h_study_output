package com.dodo.study.inout;

import java.io.FileInputStream;
import java.io.IOException;

public class In {
	public static void main(String[] args) throws IOException {
		/*FileInputStream inputStream = new FileInputStream("a.txt");
		//读一个字节
		byte[] bytes = new byte[256];
		for (;;){
			int n = inputStream.read(bytes);
			if (n == -1){
				break;
			}
			System.out.println(new String(bytes,0,n));
		}*/
		
		FileInputStream inputStream = new FileInputStream("a.txt");
		int len = 0 ;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes))!=-1){
			System.out.println(new String(bytes,0,len));
		}
		
		inputStream.close();
		
		
	}
}
