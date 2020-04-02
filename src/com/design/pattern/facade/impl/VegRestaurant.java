package com.design.pattern.facade.impl;

import com.design.pattern.model.Menus;
import com.design.pattern.model.VegMenu;

public class VegRestaurant implements Hotel 
{ 
    public Menus getMenus() 
    { 
        VegMenu v = new VegMenu(); 
        return v; 
    } 
} 