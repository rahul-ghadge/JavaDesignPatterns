package com.arya.demo.factory;

public abstract class Configuration {
	
	public static final String SERVER = "SERVER"; 
	public static final String PC = "PC"; 

	
	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	
	@Override
	public String toString() {
		return "RAM : " + this.getRAM() + ", HDD : " + this.getHDD()
				+ ", CPU : " + this.getCPU();
	}
}
