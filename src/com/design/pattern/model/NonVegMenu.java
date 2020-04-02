package com.design.pattern.model;

public class NonVegMenu implements Menus {

	@Override
	public void name() {
		System.out.println("Non veg Menu");
	}

	@Override
	public void price() {
		System.out.println("500");
	}

}
