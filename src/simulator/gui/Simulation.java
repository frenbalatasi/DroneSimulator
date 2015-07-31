package simulator.gui;

import simulator.model.CoordinationUnit;
import simulator.model.Customer;
import simulator.model.Depot;

public class Simulation {
	
	public void start() {
		CoordinationUnit.init(2,5,0);
		
		Customer c1 = new Customer(32,33);
		CoordinationUnit.triggerCustomerDemand(c1);
		
		Customer c2 = new Customer(45,60);
		CoordinationUnit.triggerCustomerDemand(c2);
		
	}
}
