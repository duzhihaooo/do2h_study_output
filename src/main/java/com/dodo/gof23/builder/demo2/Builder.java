package com.dodo.gof23.builder.demo2;

//建筑者
public abstract class Builder {
		abstract Builder buildHamburger(String msg); //汉堡
		abstract Builder buildChips(String msg); //薯条
		abstract Builder buildCola(String msg); //可乐
		abstract Builder buildDessert(String msg); //甜点
		
		abstract Product getProduct();
		
}