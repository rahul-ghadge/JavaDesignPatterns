package com.design.pattern.proxy.impl;

public class EmployeeProxy {

	Operations ops;

	public EmployeeProxy() {
		ops = new OperationImpl();
	}

	public void readDataForEmployee() {
		ops.readData();
	}

}
