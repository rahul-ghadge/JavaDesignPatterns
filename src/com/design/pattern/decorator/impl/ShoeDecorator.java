package com.design.pattern.decorator.impl;



public class ShoeDecorator implements Shoe {

	protected Shoe shoe;

	public ShoeDecorator(Shoe c) {
		this.shoe = c;
	}

	@Override
	public void design() {
		
		this.shoe.design();
	
	}
}