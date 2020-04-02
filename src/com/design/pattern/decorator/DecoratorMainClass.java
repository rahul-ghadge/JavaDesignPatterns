package com.design.pattern.decorator;

import com.design.pattern.decorator.impl.*;

public class DecoratorMainClass {

	public static void main(String[] args) {

		Shoe sporty = new SportyShoe(new BasicShoe());
		sporty.design();
		System.out.println();

		Shoe fancy = new FancyShoe(new BasicShoe());
		fancy.design();
		System.out.println();

		Shoe casual = new CasualShoe(new BasicShoe());
		casual.design();
		System.out.println("-------------");

		Shoe sportyFancy = new SportyShoe(new SportyShoe(new FancyShoe(new BasicShoe())));
		sportyFancy.design();
		System.out.println();

		Shoe casualFancy = new CasualShoe(new FancyShoe(new BasicShoe()));
		casualFancy.design();

	}
}

// *************************************************
// Output
// *************************************************

//	Basic shoe
//	Adding Sporty shoe
//	
//	Basic shoe
//	Adding Fancy shoe
//	
//	Basic shoe
//	Adding Casual shoe
//	-------------
//	Basic shoe
//	Adding Fancy shoe
//	Adding Sporty shoe
//	Adding Sporty shoe
//	
//	Basic shoe
//	Adding Fancy shoe
//	Adding Casual shoe
