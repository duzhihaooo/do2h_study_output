package com.dodo.pojo;

import java.util.StringJoiner;

public class Cat {
		private String name;
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.toString();
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		public void shout(){
				System.out.println("miaomiao~");
		};
}