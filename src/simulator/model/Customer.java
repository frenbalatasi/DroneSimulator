package simulator.model;

public class Customer {
	private int longitude;
	private int latitude;
	private CoordinationUnit cu;
	
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
	
	public void demandPackage() {
		cu = new CoordinationUnit();
		cu.customerDemand();
	}

}
