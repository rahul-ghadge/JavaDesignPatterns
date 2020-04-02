package com.design.pattern.composite;

import com.design.pattern.composite.impl.*;

public class CompositeMainClass {

	public static void main(String args[]) {
		
		Employee cashier1 = new Cashier(101, "Sohan Kumar", 20000.0);
		Employee cashier2 = new Cashier(102, "Mohan Kumar", 25000.0);
		Employee accountant = new Accountant(103, "Seema Mahiwal", 30000.0);
		Employee manager1 = new BankManager(100, "Ashwani Rajput", 100000.0);

		manager1.add(cashier1);
		manager1.add(cashier2);
		manager1.add(accountant);
		
		manager1.print();
	}
}
