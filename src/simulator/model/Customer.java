package simulator.model;

public class Customer {
	private int longitude;
	private int latitude;
	private Boolean isSatisfied = false;
	
	public Customer(int longitude, int latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
	
	public int getLatitude() {
		return latitude;
	}
	
	public Boolean isSatisfied() {
		return isSatisfied;
	}
	
	public void setSatisfied(Boolean isSatisfied) {
		this.isSatisfied = isSatisfied;
	}
}
