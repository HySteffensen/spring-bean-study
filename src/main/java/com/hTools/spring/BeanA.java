package com.hTools.spring;

public class BeanA {
	
	public BeanA(String value) {
		System.out.println("In the String constructor");
		System.out.println(value);
	}
	
	public BeanA(int value) {
		System.out.println("In the int constructor");
		System.out.println(value);
	}
}
