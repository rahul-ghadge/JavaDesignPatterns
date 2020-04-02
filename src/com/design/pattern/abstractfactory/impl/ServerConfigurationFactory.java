package com.design.pattern.abstractfactory.impl;

public class ServerConfigurationFactory implements ConfigurationAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerConfigurationFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Configuration getConfiguration() {
		return new Server(ram, hdd, cpu);
	}

}
