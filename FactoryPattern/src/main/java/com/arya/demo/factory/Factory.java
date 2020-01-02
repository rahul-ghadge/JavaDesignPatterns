package com.arya.demo.factory;

public class Factory {

	public static Configuration getConfiguration(String configFor, 
												 String ram,
												 String hdd, 
												 String cpu) throws Exception {

		if (null != configFor && configFor.trim().length() > 0) {

			switch (configFor) {
	
				case Configuration.SERVER:
					System.out.println("----------- Server configuration -----------");
					return new Server(ram, hdd, cpu);
	
				case Configuration.PC:
					System.out.println("----------- Personal Computer configuration -------------");
					return new PC(ram, hdd, cpu);
	
				default:
					break;
			}
		}
		throw new Exception("No such factory class");
	}
}
