package com.arya.demo.factory;

public class Laptop extends Configuration {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Laptop(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	

	@Override
	public String getRAM() {
		return this.ram + " GB for Laptop";
	}

	@Override
	public String getHDD() {
		return this.hdd+ " GB for Laptop";
	}

	@Override
	public String getCPU() {
		return this.cpu+ " GHz Processor for Laptop";
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
