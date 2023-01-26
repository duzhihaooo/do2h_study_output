package com.dodo.gof23.builder.demo2;

import java.util.StringJoiner;

public class Product {
		
		private String Hamburger = "汉堡包";
		private String Chips     = "大薯条";
		private String Cola      = "可口可乐";
		private String Dessert   = "甜筒";
		
		
		
		public String getHamburger() {
				return Hamburger;
		}
		
		public void setHamburger(String hamburger) {
				Hamburger = hamburger;
		}
		
		public String getChips() {
				return Chips;
		}
		
		public void setChips(String chips) {
				Chips = chips;
		}
		
		public String getCola() {
				return Cola;
		}
		
		public void setCola(String cola) {
				Cola = cola;
		}
		
		public String getDessert() {
				return Dessert;
		}
		
		public void setDessert(String dessert) {
				Dessert = dessert;
		}
		@Override
		public String toString() {
				return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
						.add("Hamburger='" + Hamburger + "'")
						.add("Chips='" + Chips + "'")
						.add("Cola='" + Cola + "'")
						.add("Dessert='" + Dessert + "'")
						.toString();
		}
		
}