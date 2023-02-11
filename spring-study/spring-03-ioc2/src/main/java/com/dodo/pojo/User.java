package com.dodo.pojo;

import java.util.StringJoiner;

public class User {
		private String name;
		
		public void show(){
				System.out.println("name=" + name);
		}
		
		public User(){
				System.out.println("无参构造");
		};
		
		public User(String name) {
				this.name = name;
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		@Override
		public String toString() {
				return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.toString();
		}
}