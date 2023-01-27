package com.dodo.gof23.factory.abstract1.test01;

public interface IProductFactory {
		
		//todo：接口里面再传接口 这个()讲解下
		IphoneProduct IPHONE_PRODUCT();
		IRouterProduct I_ROUTER_PRODUCT();

}