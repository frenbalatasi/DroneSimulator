package simulator.model;

import java.util.ArrayList;

public class CoordinationUnit {
	
	private final static ArrayList<Depot> DEPOTSLIST = new ArrayList<Depot>();
	private static ArrayList<Drone> dronesList = new ArrayList<Drone>();
	private static ArrayList<Customer> customersList= new ArrayList<Customer>();
	private static Depot selectedDepot;
	private static Drone selectedDrone;
	private static int algorithmNumber;
	
	public static void init(int numberOfDepots, int numberOfDronesForEachDepot, int algoNumber) {
		algorithmNumber = algoNumber;
		
		for (int i = 0; i < numberOfDepots; i++) {
			DEPOTSLIST.add(i, new Depot(2,3));
		}
		
		for (int i = 0; i < numberOfDepots; i++) {
			for (int j = 0; j < numberOfDronesForEachDepot; j++) {
				DEPOTSLIST.get(i).attachOneDrone(new Drone(j, DEPOTSLIST.get(i)));
			}
		}
	}

	public static void createCustomerDemand(Customer customer) {
		customersList.add(customersList.size(), customer);
		for (int i = 0; i < dronesList.size(); i++) {
			dronesList.remove(i);
		}
		
		if (customersList.size() > 2)
		{
			for (int i = 0; i < customersList.size(); i++) {
				switch (algorithmNumber) {
				case 0:
					chooseClosestDroneWithPriorityLevel();
					break;
					
				case 1:
					chooseClosestDroneFromAuctionList();
					break;
				}
				
				selectedDrone.setCurrentlyServing(true);
				customersList.get(i).setSatisfied(true);
				selectedDrone.setCurrentlyServing(false);
			}
			
		}
		
	}

	private static void chooseClosestDroneWithPriorityLevel() {
		selectedDepot = DEPOTSLIST.get(0);
		dronesList.addAll(selectedDepot.getListOfDrones());
		selectedDrone = dronesList.get(0);
		
		for (int i = 0; i < dronesList.size(); i++) {
			if(dronesList.get(i).getPriorityLevel() > selectedDrone.getPriorityLevel())
				selectedDrone = dronesList.get(i);
		}
	}

	private static void chooseClosestDroneFromAuctionList() {
		selectedDepot = DEPOTSLIST.get(0);
	}
}
