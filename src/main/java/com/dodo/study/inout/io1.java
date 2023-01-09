package com.dodo.study.inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class io1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("a.txt");
		//todo .read()  读取一个字节，返回值为读取到的字节的int类型值，读取到文件末尾返回-1
		int x = fileInputStream.read();	//从硬盘上读取一个字节
		System.out.println("x="+x);	//x=97
		int y = fileInputStream.read();
		System.out.println("y="+y);	//y=98
		int z = fileInputStream.read();
		System.out.println("z="+z);	//z=99
		fileInputStream.close();	//关闭流
		
		//read()方法一次读取一个字节，并把读取到的字节赋值成int类型，a对应的ascii码为97，b对应的为98，当读到文件末尾的时候，方法返回-1
		
		FileInputStream fileInputStream2 = new FileInputStream("a.txt");
		//.read()把读取到的字节返回int  所以以int接收
		int a;
		while ((a=fileInputStream2.read())!=-1){
			System.out.println(a);
		}
		fileInputStream2.close();
		System.out.println("------------------");
		FileInputStream fileInputStream3 = new FileInputStream("a.txt");
		byte[] bytes = new byte[2];	//定义长度2的字节数组
		int b = fileInputStream3.read(bytes);	//一次最多将bytes.length个字节读取到bytes中，返回读取到的字节数
		System.out.println("读取到的字节个数："+b);
		for (byte b1:bytes){
			System.out.println(b1);
		}
		System.out.println("----");
		b = fileInputStream3.read(bytes);
		System.out.println("读取到的字节个数："+b);
		for (byte b1:bytes){
			System.out.println(b1);
		}
		fileInputStream3.close();
		
		
		
	}
}
