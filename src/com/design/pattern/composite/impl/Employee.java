package com.design.pattern.composite.impl;



public interface Employee {
	
	// For Composite and Leaf Objects
	public int getId();

	public String getName();

	public double getSalary();

	public void print();

	
	// Only for Composite
	public void add(Employee employee);

	public void remove(Employee employee);

	public Employee getChild(int i);
}