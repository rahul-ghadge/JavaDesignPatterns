package com.design.pattern.proxy;

import com.design.pattern.proxy.impl.AdminProxy;
import com.design.pattern.proxy.impl.EmployeeProxy;

public class ProxyMainClass {

	public static void main(String[] args) {
		
		AdminProxy admin = new AdminProxy();
		
		admin.addData();
		admin.readDataForAdmin();
		
		
		EmployeeProxy employee = new EmployeeProxy();
		
		employee.readDataForEmployee();

	}

}
