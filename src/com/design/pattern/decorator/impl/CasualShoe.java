package com.design.pattern.decorator.impl;



public class CasualShoe extends ShoeDecorator {

	public CasualShoe(Shoe c) {
		super(c);
	}

	@Override
	public void design() {
		super.design();
		System.out.println("Adding Casual shoe");
	}
}