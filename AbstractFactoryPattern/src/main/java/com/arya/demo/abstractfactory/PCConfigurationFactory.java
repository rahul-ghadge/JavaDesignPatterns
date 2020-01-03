package com.arya.demo.abstractfactory;

public class PCConfigurationFactory implements ConfigurationAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCConfigurationFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Configuration getConfiguration() {
		return new PC(ram, hdd, cpu);
	}	

}
