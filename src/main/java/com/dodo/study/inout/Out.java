package com.dodo.study.inout;

import java.io.*;

public class Out {
	/**
	 IO流用来处理设备之间的数据传输，上传文件和下载文件，
	 Java对数据的操作是通过流的方式，Java用于操作流的对象都在IO包中
	 IO流分类:输入流 读入数据
	         输出流 写出数据
	 按照数据类型:字节流  字符流
	 如果数据所在的文件通过windows自带的记事本打开并能读懂里面的内容，就用字符流，其他用字节流。
	 如果你什么都不知道，就用字节流。
	*/
	//IO流常用基类
	//字节流的抽象基类：InputStream ，OutputStream
	//字符流的抽象基类：Reader ， Writer
	public static void main(String[] args) {
		/**
		 * new FileOutputStream("a.txt",true);  第二个参数true，设置为写入的数据拼接在尾部
		 * \n\r 换行
		 * write(bys,1,3);  写入字节数组
		 */
		FileOutputStream outputStream = null;
		try {
			//FileOutputStream fos = new FileOutputStream(file);
			outputStream = new FileOutputStream("a.txt",true);	//第二个参数true设置为文本可追加
			/*
			 * 创建字节输出流对象了做了几件事情：
			 * A:调用系统功能去创建文件
			 * B:创建outputStream对象
			 * C:把outputStream对象指向这个文件
			 */
			//从方法中可看出，只能通过字节写出
			outputStream.write("HelloWorld".getBytes());
			outputStream.write("\n\r".getBytes());
			outputStream.write(97);
			outputStream.write("\n\r".getBytes());
			for (int i=0;i<5;i++){
				outputStream.write("hello".getBytes());
				outputStream.write("\n\r".getBytes());
			}
			byte[] bys = {97,98,99,100,101};
			outputStream.write(bys,1,3);// TODO: 2023/1/5 看不懂
		} catch (IOException e){
			e.printStackTrace();
		}
		finally {
				try {
					outputStream.close();	//关闭流
				} catch (IOException e){
					e.printStackTrace();
				}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
