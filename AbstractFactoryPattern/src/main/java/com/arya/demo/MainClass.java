package com.arya.demo;

import com.arya.demo.abstractfactory.Configuration;
import com.arya.demo.abstractfactory.ConfigurationAbstractFactory;
import com.arya.demo.abstractfactory.PCConfigurationFactory;
import com.arya.demo.abstractfactory.ServerConfigurationFactory;

public class MainClass {

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
