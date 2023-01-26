package com.dodo.gof23.prototype.demo02;

import java.util.Date;
import java.util.StringJoiner;

public class Video implements Cloneable{
		private String name;
		private Date createTime;
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
				Object obj = super.clone();
				//实现深克隆：序列化，反序列化
				Video v = (Video) obj;
				v.createTime = (Date) this.createTime.clone();  //将这个对象的属性进行克隆
				
				return obj;
		}
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Video.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.add("createTime=" + createTime)
						.toString();
		}
		
		Video(){}
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
		
		public Date getCreateTime() {
				return createTime;
		}
		
		public void setCreateTime(Date createTime) {
				this.createTime = createTime;
		}
}