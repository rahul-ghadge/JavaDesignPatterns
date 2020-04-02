package com.design.pattern.decorator.impl;



public class SportyShoe extends ShoeDecorator {

	public SportyShoe(Shoe c) {
		super(c);
	}

	@Override
	public void design() {
		super.design();
		System.out.println("Adding Sporty shoe");
	}
}