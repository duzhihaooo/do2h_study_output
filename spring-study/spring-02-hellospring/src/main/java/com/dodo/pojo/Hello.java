package com.dodo.pojo;

import java.util.StringJoiner;

public class Hello {
		private String name;
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Hello.class.getSimpleName() + "[", "]")
						.add("name='" + name + "'")
						.toString();
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
}