package com.dodo.study.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		//字节流复制文件
		FileInputStream fileInputStream = new FileInputStream("D:\\漂亮美眉.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\美女.jpg");
		byte[] bytes = new byte[256];
		int len = 0;
		while ((len=(fileInputStream.read(bytes)))!=-1){
			fileOutputStream.write(bytes,0,len);
		}
		fileInputStream.close();
		fileOutputStream.close();
		
	}
}
