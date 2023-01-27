package com.dodo.gof23.builder.test01;

import java.util.StringJoiner;

public class Product {
		private String hamburger ="汉堡包";
		private String chips = "大薯条";
		private String cola = "可乐";
		private String dessert = "甜筒";
		
		@Override
		public String toString() {
				return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
						.add("hamburger='" + hamburger + "'")
						.add("chips='" + chips + "'")
						.add("cola='" + cola + "'")
						.add("dessert='" + dessert + "'")
						.toString();
		}
		
		public String getHamburger() {
				return hamburger;
		}
		
		public void setHamburger(String hamburger) {
				this.hamburger = hamburger;
		}
		
		public String getChips() {
				return chips;
		}
		
		public void setChips(String chips) {
				this.chips = chips;
		}
		
		public String getCola() {
				return cola;
		}
		
		public void setCola(String cola) {
				this.cola = cola;
		}
		
		public String getDessert() {
				return dessert;
		}
		
		public void setDessert(String dessert) {
				this.dessert = dessert;
		}
}