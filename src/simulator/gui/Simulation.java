package simulator.gui;

import java.util.ArrayList;

import simulator.model.CoordinationUnit;
import simulator.model.Customer;
import simulator.model.Depot;
import simulator.model.Drone;

public class Simulation {
	
	private ArrayList<Depot> depotsList = new ArrayList<Depot>();
	private ArrayList<Customer> customersList = new ArrayList<Customer>();
	private Drone correspondingDrone;
	private Depot closestDepot;
	private CoordinationUnit coordinationUnit;
	
	public void start() {
		init(2,5);
		coordinationUnit = new CoordinationUnit("PriorityLevel", depotsList);
		Boolean isCustomerSatisfied = false;
		
		while(!isCustomerSatisfied) {
			Customer c1 = new Customer(32,33);
			customersList.add(c1);
			
			closestDepot = coordinationUnit.selectClosestDepot(c1);
			correspondingDrone = coordinationUnit.selectCorrespondingDrone(closestDepot);
			
			correspondingDrone.setCurrentlyServing(true);
			closestDepot.removeOneDrone(correspondingDrone);
			
			c1.setSatisfied(true);
			correspondingDrone.setCurrentlyServing(false);
			depotsList.get(1).attachOneDrone(correspondingDrone);
		}
	}
	
	private void init(int numberOfDepots, int numberOfDronesForEachDepot) {
		for (int i = 0; i < numberOfDepots; i++) {
			depotsList.add(i, new Depot(2,3));
		}
		
		for (int i = 0; i < numberOfDepots; i++) {
			for (int j = 0; j < numberOfDronesForEachDepot; j++) {
				depotsList.get(i).attachOneDrone(new Drone(j));
			}
		}
	}
}
