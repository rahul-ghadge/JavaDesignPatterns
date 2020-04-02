package com.arya.demo;

import com.arya.demo.factory.Configuration;
import com.arya.demo.factory.Factory;
import com.arya.demo.utils.ConstantUtil;

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
