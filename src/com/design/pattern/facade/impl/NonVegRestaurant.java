package com.design.pattern.facade.impl;

import com.design.pattern.model.Menus;
import com.design.pattern.model.NonVegMenu;

public class NonVegRestaurant implements Hotel 
{ 
    public Menus getMenus() 
    { 
        NonVegMenu nv = new NonVegMenu(); 
        return nv; 
    } 
} 