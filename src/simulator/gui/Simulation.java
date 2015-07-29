package simulator.gui;

import simulator.model.CoordinationUnit;
import simulator.model.Customer;
import simulator.model.Depot;

public class Simulation {
	
	public void start() {
		CoordinationUnit cu = new CoordinationUnit();
		cu.init();
		
		Customer c1 = new Customer(32,33);
		c1.demandPackage();
		
		Customer c2 = new Customer(44,56);
		c2.demandPackage();
		
	}
}
