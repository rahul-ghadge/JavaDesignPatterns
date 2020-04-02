package com.design.pattern.iterator;

import com.design.pattern.iterator.impl.*;
import com.design.pattern.model.SuperHero;

public class MainClass {

	    public static void main(String[] args) 
	    {
	        SuperHero[] superHeros = new SuperHero[5];
	        superHeros[0] = new SuperHero("Bruce", "Hulk", "Doctore", 50, false);
	        superHeros[1] = new SuperHero("Steve", "Captain America", "Solder", 120, false);
	        superHeros[2] = new SuperHero("Tony", "Iron Man", "Business man", 45, true);
	        superHeros[3] = new SuperHero("Peter", "Spider Man", "Student", 21, true);
	        superHeros[4] = new SuperHero("Wade", "Deadpool", "Street fighter", 28, true);
	         
	        SuperHeroArray<SuperHero> arr = new SuperHeroList(superHeros);
	         
	        Itr<SuperHero> iterator = arr.getIterator();
	         
	        while(iterator.hasNext()) {
	            SuperHero currentSuperHero = iterator.next();
	            System.out.println(currentSuperHero);
	        }
	    }
	}