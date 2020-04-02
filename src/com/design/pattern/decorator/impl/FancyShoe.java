package com.design.pattern.decorator.impl;



public class FancyShoe extends ShoeDecorator {

	public FancyShoe(Shoe c) {
		super(c);
	}

	@Override
	public void design() {
		super.design();
		System.out.println("Adding Fancy shoe");
	}
}