package com.design.pattern.factory.impl;

public class Server extends Configuration {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram + " GB for Server";
	}

	@Override
	public String getHDD() {
		return this.hdd+ " GB for Server";
	}

	@Override
	public String getCPU() {
		return this.cpu+ " GHz Processor for Server";
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
