package com.design.pattern.proxy.impl;

public class OperationImpl implements Operations {

	@Override
	public void readData() {
		System.out.println("Reading data");
	}

	@Override
	public void addData() {
		System.out.println("Adding data");
	}

	@Override
	public void deleteData() {
		System.out.println("Deleting data");
	}

	@Override
	public void updateData() {
		System.out.println("updating data");
	}

}
