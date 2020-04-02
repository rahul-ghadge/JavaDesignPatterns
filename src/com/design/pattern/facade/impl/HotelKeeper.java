package com.design.pattern.facade.impl;

import com.design.pattern.model.NonVegMenu;
import com.design.pattern.model.VegMenu;
import com.design.pattern.model.VegNonVegMenu;


public class HotelKeeper {

	public VegMenu getVegMenu() {
		VegRestaurant v = new VegRestaurant();
		VegMenu vegMenu = (VegMenu) v.getMenus();
		return vegMenu;
	}

	public NonVegMenu getNonVegMenu() {
		NonVegRestaurant v = new NonVegRestaurant();
		NonVegMenu NonvegMenu = (NonVegMenu) v.getMenus();
		return NonvegMenu;
	}

	public VegNonVegMenu getVegNonMenu() {
		VegNonBothRestaurant v = new VegNonBothRestaurant();
		VegNonVegMenu bothMenu = (VegNonVegMenu) v.getMenus();
		return bothMenu;
	}
}