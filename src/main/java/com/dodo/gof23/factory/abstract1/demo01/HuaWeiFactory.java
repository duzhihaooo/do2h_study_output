package com.dodo.gof23.factory.abstract1.demo01;

public class HuaWeiFactory implements IProductFactory{
		
		@Override
		public IphoneProduct iphoneProduct() {
				return new HuaWeiPhone();
		}
		
		@Override
		public IRouterProduct iRouterProduct() {
				return new HuaWeiRouter();
		}
}