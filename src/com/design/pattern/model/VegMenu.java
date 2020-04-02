package com.design.pattern.model;

public class VegMenu implements Menus {

	@Override
	public void name() {
		System.out.println("Veg Menu");
	}

	@Override
	public void price() {
		System.out.println("400");
	}

}
