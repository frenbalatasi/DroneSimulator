package simulator.model;

import java.util.ArrayList;

public class CoordinationUnit {
	
	private ArrayList<Depot> depotsList;
	private String algorithmName;
	
	public CoordinationUnit(String algorithmName, ArrayList<Depot> depotsList) {
		this.depotsList = depotsList;
		this.algorithmName = algorithmName;
	}
	
	public Depot selectClosestDepot(Customer customer) {
		Depot selectedDepot = depotsList.get(0);
		return selectedDepot;
	}
	
	public Drone selectCorrespondingDrone(Depot closestDepot) {
		switch (algorithmName) {
			case "PriorityLevel":
				return chooseClosestDroneWithPriorityLevel(closestDepot);
				
			case "AuctionList":
				return chooseClosestDroneFromAuctionList(closestDepot);

			default:
				return closestDepot.getListOfDrones().get(0);
		}
	}

	private Drone chooseClosestDroneWithPriorityLevel(Depot closestDepot) {
		ArrayList<Drone> dronesList = new ArrayList<Drone>();
		dronesList.addAll(closestDepot.getListOfDrones());
		Drone selectedDrone = dronesList.get(0);
		
		for (int i = 0; i < dronesList.size(); i++) {
			if(dronesList.get(i).getPriorityLevel() > selectedDrone.getPriorityLevel())
				selectedDrone = dronesList.get(i);
		}
		
		return selectedDrone;
	}

	private Drone chooseClosestDroneFromAuctionList(Depot closestDepot) {
		ArrayList<Drone> dronesList = new ArrayList<Drone>();
		dronesList.addAll(closestDepot.getListOfDrones());
		Drone selectedDrone = dronesList.get(0);
		
		return selectedDrone;
	}
}
