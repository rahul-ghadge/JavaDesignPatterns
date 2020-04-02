package com.design.pattern.facade;

import com.design.pattern.facade.impl.HotelKeeper;
import com.design.pattern.model.NonVegMenu;
import com.design.pattern.model.VegMenu;
import com.design.pattern.model.VegNonVegMenu;

public class FacadeMainClass {

	public static void main(String[] args) {
		
		HotelKeeper keeper = new HotelKeeper(); 
        
        VegMenu v = keeper.getVegMenu(); 
        NonVegMenu nv = keeper.getNonVegMenu(); 
        VegNonVegMenu vegNonVegMenu = keeper.getVegNonMenu(); 
        
        v.name();
        nv.name();
        vegNonVegMenu.name();
        

	}

}
