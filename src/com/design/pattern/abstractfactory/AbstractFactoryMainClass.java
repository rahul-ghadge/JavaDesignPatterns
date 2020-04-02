package com.design.pattern.abstractfactory;


import com.design.pattern.abstractfactory.impl.*;

public class AbstractFactoryMainClass {
	
	
	public static void main(String[] args) throws Exception {
		
		Configuration serverConfiguration = 
				getConfiguration(new ServerConfigurationFactory("8", "500", "2.9"));

		Configuration pcConfiguration = 
				getConfiguration(new PCConfigurationFactory("8", "500", "2.4"));
		
		System.out.println(serverConfiguration.getRAM());
		System.out.println(serverConfiguration.getCPU());
		System.out.println(pcConfiguration.getRAM());
	}
	
	
	public static Configuration getConfiguration(ConfigurationAbstractFactory caFactory) {
		return caFactory.getConfiguration();
	}

}
