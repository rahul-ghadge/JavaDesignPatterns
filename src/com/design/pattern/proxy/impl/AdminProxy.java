package com.design.pattern.proxy.impl;

public class AdminProxy {
	
	Operations ops = new OperationImpl();
	
	
	public void readDataForAdmin() {
		ops.readData();
		System.out.println(" for Admin");
	}

	public void addData() {
		ops.addData();
	}

	public void deleteData() {
		ops.deleteData();
	}

	public void updateData() {
		ops.updateData();
	}

}
