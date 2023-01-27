package com.dodo.gof23.factory.abstract1.demo01;

//抽象产品工厂
public interface IProductFactory {
		//生产手机
		IphoneProduct iphoneProduct();
		
		//生产路由器
		IRouterProduct iRouterProduct();
		
		
}