package com.hTools.spring;

public class BeanA {
	
	public BeanA(BeanB beanBLocal) {
		System.out.println("In the Object constructor");
		beanBLocal.execute();
		
	}
}
