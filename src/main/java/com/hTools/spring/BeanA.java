package com.hTools.spring;

public class BeanA {
	
	public BeanA(BeanB beanB) {
		System.out.println("In the Object constructor");
		beanB.execute();
		
	}
}
