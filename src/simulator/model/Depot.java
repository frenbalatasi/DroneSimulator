package simulator.model;

import java.util.ArrayList;

public class Depot {
	private int longitude;
	private int latitude;
	private ArrayList<Drone> listOfDrones;
	
	public Depot(int longitude, int latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
	
	public int getLatitude() {
		return latitude;
	}
	
	public ArrayList<Drone> getListOfDrones() {
		return listOfDrones;
	}

	public void attachListOfDrones(ArrayList<Drone> listOfDrones) {
		this.listOfDrones = listOfDrones;
	}
	
	public void attachOneDrone(Drone droneToBeAttached) {
		listOfDrones.add(listOfDrones.size(),droneToBeAttached);
	}
	
	public void removeOneDrone(Drone droneToBeRemoved) {
		listOfDrones.remove(droneToBeRemoved);
	}
	
	public void removeAllDrones() {
		for (int i = 0; i < listOfDrones.size(); i++) {
			listOfDrones.remove(i);
		}
	}

}
