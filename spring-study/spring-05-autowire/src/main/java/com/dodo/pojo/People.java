package com.dodo.pojo;


import java.util.StringJoiner;
import javax.annotation.Resource;

public class People {
		@Resource(name = "cat2")
		private Cat cat;
		@Resource(name = "dog2")
		private Dog dog;
		private String name;
		
		@Override
		public String toString() {
				return new StringJoiner(", ", People.class.getSimpleName() + "[", "]")
						.add("cat=" + cat)
						.add("dog=" + dog)
						.add("name='" + name + "'")
						.toString();
		}
		
		public Cat getCat() {
				return cat;
		}
		
		public void setCat(Cat cat) {
				this.cat = cat;
		}
		
		public Dog getDog() {
				return dog;
		}
		
		public void setDog(Dog dog) {
				this.dog = dog;
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
}