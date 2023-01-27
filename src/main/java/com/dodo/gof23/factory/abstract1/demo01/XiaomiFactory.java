package com.dodo.gof23.factory.abstract1.demo01;

public class XiaomiFactory implements IProductFactory{
		
		@Override
		public IphoneProduct iphoneProduct() {
				return new XiaomiPhone();
		}
		
		@Override
		public IRouterProduct iRouterProduct() {
				return new XiaomiRouter();
		}
}