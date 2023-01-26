package com.dodo.gof23.prototype.demo01;

import java.util.Date;
import java.util.StringJoiner;

/*
1.实现一个接口  Cloneable
2.重写一个方法  Clone()
 */
public class Video implements Cloneable{
		
		private String name;
		private Date createTime;
		Video(){
		
		}
		
		Video(String name,Date date){
				this.name = name;
				this.createTime = date;
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		public Date getDate() {
				return createTime;
		}
		
		public void setDate(Date date) {
				this.createTime = date;
		}
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Video.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.add("date=" + createTime)
						.toString();
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
				return super.clone();
		}
}