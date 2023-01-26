package com.dodo.gof23.prototype.demo01;

import java.util.Date;

/*
客户端：克隆
 */
public class BiliBili {
		
		public static void main(String[] args) throws CloneNotSupportedException {
				//原型对象  v1
				Date date = new Date();
				Video video = new Video("大话西游",date);
				
				//v1  克隆  v2
				//Video clone = new Video("大话西游",date);
				Video clone = (Video) video.clone();    //克隆出来的对象和原来是一模一样
				
				date.setTime(53521211);
				clone.setName("西游记");
				System.out.println("video:"+video);
				System.out.println("clone:"+clone);
				
				
		}
}