package com.design.pattern.factory;

import com.design.pattern.factory.impl.*;

public class FactoryMainClass {

	public static void main(String[] args) throws Exception {

		Configuration serverConfiguration = Factory
				.getConfiguration(ConstantUtil.SERVER, "8", "500", "2.9");
		
		Configuration pcConfiguration = Factory
				.getConfiguration(ConstantUtil.PC, "8", "500", "2.4");
		
		Configuration laptopConfiguration = Factory
				.getConfiguration(ConstantUtil.LAPTOP, "8", "500", "2.4");
		
		System.out.println("\n****************************************************");
		
		System.out.println("Server : " + serverConfiguration.getRAM());
		System.out.println("PC     : " + pcConfiguration.getRAM());
		System.out.println("Laptop : " + laptopConfiguration.getHDD());
		
		System.out.println("****************************************************\n");
		
		Thread.sleep(10);
		@SuppressWarnings("unused")
		Configuration noConfiguration = Factory.getConfiguration(null, null, null, null);

	}
}


// ***************************************************
// Output
// ***************************************************
//	----------- Server configuration -----------
//	----------- Personal Computer configuration -------------
//	----------- Laptop configuration -------------
//	
//	****************************************************
//	Server : 8 GB for Server
//	PC     : 8 GB for PC
//	Laptop : 500 GB for Laptop
//	****************************************************
//	
//	Exception in thread "main" java.lang.Exception: No such factory class
//		at com.arya.demo.factory.Factory.getConfiguration(Factory.java:33)
//		at com.arya.demo.FactoryMainClass.main(FactoryMainClass.java:30)

