package com.dodo.gof23.factory.abstract1.test01;

public class HuaWeiFactory implements IProductFactory{
		
		@Override
		public IphoneProduct IPHONE_PRODUCT() {
				return new HuaWeiPhone();
		}
		
		@Override
		public IRouterProduct I_ROUTER_PRODUCT() {
				return new HuaWeiRouter();
		}
}