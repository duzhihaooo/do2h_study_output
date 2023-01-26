package com.dodo.gof23.prototype.demo02;

import java.util.Date;

public class BiliBili {
		
		public static void main(String[] args) throws CloneNotSupportedException {
				Date date = new Date();
				Video video = new Video("流浪地球",date);
				
				Video clone = (Video) video.clone();
				date.setTime(1231251);
				System.out.println("video:"+video);
				System.out.println("clone:"+clone);
				
				
		}
}