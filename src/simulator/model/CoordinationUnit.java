package simulator.model;

import java.util.ArrayList;

public class CoordinationUnit {
	
	public final static Depot[] DEPOTSLIST = new Depot[2];
	public final static Drone[] DRONESLIST = new Drone[10];
	public final static Drone[] DRONELIST_DEPOT1 = new Drone[5];
	public final static Drone[] DRONELIST_DEPOT2 = new Drone[5];
	
	private Depot selectedDepot;
	private Drone selectedDrone;
	
	public void init() {
		DEPOTSLIST[0] = new Depot(2,3);
		DEPOTSLIST[1] = new Depot(1,1);
		
		DRONESLIST[0]= new Drone(1, 1, 1, DEPOTSLIST[0]);
		DRONESLIST[1] = new Drone(1, 1, 2, DEPOTSLIST[0]);
		DRONESLIST[2] = new Drone(1, 1, 3, DEPOTSLIST[0]);
		DRONESLIST[3] = new Drone(1, 1, 4, DEPOTSLIST[0]);
		DRONESLIST[4] = new Drone(1, 1, 5, DEPOTSLIST[0]);
		
		DRONELIST_DEPOT1[0] = DRONESLIST[0];
		DRONELIST_DEPOT1[1] = DRONESLIST[1];
		DRONELIST_DEPOT1[2] = DRONESLIST[2];
		DRONELIST_DEPOT1[3] = DRONESLIST[3];
		DRONELIST_DEPOT1[4] = DRONESLIST[4];
		
		DRONESLIST[5] = new Drone(1, 1, 6, DEPOTSLIST[1]);
		DRONESLIST[6] = new Drone(1, 1, 7, DEPOTSLIST[1]);
		DRONESLIST[7] = new Drone(1, 1, 8, DEPOTSLIST[1]);
		DRONESLIST[8] = new Drone(1, 1, 9, DEPOTSLIST[1]);
		DRONESLIST[9] = new Drone(1, 1, 10, DEPOTSLIST[1]);
		
		DRONELIST_DEPOT1[5] = DRONESLIST[5];
		DRONELIST_DEPOT1[6] = DRONESLIST[6];
		DRONELIST_DEPOT1[7] = DRONESLIST[7];
		DRONELIST_DEPOT1[8] = DRONESLIST[8];
		DRONELIST_DEPOT1[9] = DRONESLIST[9];
		
		DEPOTSLIST[0].attachDrones(DRONELIST_DEPOT1);
		DEPOTSLIST[1].attachDrones(DRONELIST_DEPOT2);
	}
	
	public void customerDemand() {
		selectedDepot = depotSelection();
		selectedDrone = selectedDepot.chooseDroneFromList();
		selectedDrone.serveCustomer();
	}

	private Depot depotSelection() {
		return DEPOTSLIST[2];
	}

}
