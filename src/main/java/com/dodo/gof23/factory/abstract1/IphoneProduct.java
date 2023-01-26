package com.dodo.gof23.factory.abstract1;

//手机产品接口
public interface IphoneProduct {
		//开机
		void start();
		//关机
		void shutdown();
		//打电话
		void callup();
		//发短信
		void sendSMS();
}