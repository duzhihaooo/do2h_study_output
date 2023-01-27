package com.dodo.gof23.factory.abstract1.test01;

public class AppleFactory implements IProductFactory{
		
		@Override
		public IphoneProduct IPHONE_PRODUCT() {
				return new AppleIphone();
		}
		
		@Override
		public IRouterProduct I_ROUTER_PRODUCT() {
				return new AppleIRouter();
		}
}