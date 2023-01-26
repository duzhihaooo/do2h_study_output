package com.dodo.gof23.builder.demo;

//指挥：核心  负责指挥构建一个工程，工程如何构建，由它决定
public class Director {
		
		public Product build(Builder builder){
				
				//指挥工人按照顺序建房子
				builder.buildA();
				builder.buildB();
				builder.buildC();
				builder.buildD();
				
				return builder.getProduct();
				
				
		}




}