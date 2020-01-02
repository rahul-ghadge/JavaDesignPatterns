package com.arya.demo.factory;

public class PC extends Configuration {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram + " GB for PC";
	}

	@Override
	public String getHDD() {
		return this.hdd+ " GB for PC";
	}

	@Override
	public String getCPU() {
		return this.cpu+ " Processor for PC";
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
}
