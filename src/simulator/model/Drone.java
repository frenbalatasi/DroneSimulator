package simulator.model;

public class Drone {
	private int priorityLevel;
	private int longitude;
	private int latitude;
	private int batteryLevel;
	private Boolean currentlyServing;
	private Depot attachedDepot;
	
	public Drone(int priorityLevel, Depot attachedDepot) {
		setBatteryLevel(100);
		setCurrentlyServing(false);
		setPriorityLevel(priorityLevel);
		setAttachedDepot(attachedDepot);
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public Boolean isCurrentlyServing() {
		return currentlyServing;
	}
	public void setCurrentlyServing(Boolean currentlyServing) {
		this.currentlyServing = currentlyServing;
	}
	
	public Depot getAttachedDepot() {
		return attachedDepot;
	}
	public void setAttachedDepot(Depot attachedDepot) {
		this.attachedDepot = attachedDepot;
	}

}
