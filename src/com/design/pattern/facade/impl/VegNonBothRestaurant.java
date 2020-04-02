package com.design.pattern.facade.impl;

import com.design.pattern.model.Menus;
import com.design.pattern.model.VegNonVegMenu;

public class VegNonBothRestaurant implements Hotel 
{ 
    public Menus getMenus() 
    { 
    	VegNonVegMenu b = new VegNonVegMenu(); 
        return b; 
    } 
} 