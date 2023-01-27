package com.dodo.gof23.builder.test01;

public abstract class Builder {
		//todo:抽象类中 所以方法都需要加abstract字段吗
		abstract Builder makeHamburger(String msg);
		abstract Builder makeChips(String msg);
		abstract Builder makeCola(String msg);
		abstract Builder makeDessert(String msg);
		
		abstract Product getProduct();
		
}