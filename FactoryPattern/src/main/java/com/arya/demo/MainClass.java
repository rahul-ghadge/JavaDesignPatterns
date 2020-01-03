package com.arya.demo;

import com.arya.demo.factory.Configuration;
import com.arya.demo.factory.Factory;

public class MainClass {

	public static void main(String[] args) throws Exception {

		Configuration serverConfiguration = Factory
				.getConfiguration(Configuration.SERVER, "8", "500", "2.9");
		
		Configuration pcConfiguration = Factory
				.getConfiguration(Configuration.PC, "8", "500", "2.4");
		
		System.out.println(serverConfiguration.getRAM());
		System.out.println(pcConfiguration.getRAM());
		
		
		@SuppressWarnings("unused")
		Configuration noConfiguration = Factory.getConfiguration(null, null, null, null);

	}
}
