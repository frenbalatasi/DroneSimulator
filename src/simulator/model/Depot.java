package simulator.model;

public class Depot {
	private int longitude;
	private int latitude;
	private int numberOfPackages;
	private Drone[] listOfDrones;
	private Drone selectedDrone;
	private CoordinationUnit cu;
	
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
	
	public int getNumberOfPackages() {
		return numberOfPackages;
	}
	
	public int getNumberOfDrones() {
		return listOfDrones.length;
	}

	public Drone[] getListOfDrones() {
		return listOfDrones;
	}

	public void attachDrones(Drone[] listOfDrones) {
		this.listOfDrones = listOfDrones;
	}
	
	public Drone chooseDroneFromList() {
		selectedDrone = listOfDrones[0];
		
		for (int i = 0; i < listOfDrones.length; i++) {
			if(listOfDrones[i].getPriorityLevel() > selectedDrone.getPriorityLevel())
				selectedDrone = listOfDrones[i];
		}
		
		return selectedDrone;
	}

}
