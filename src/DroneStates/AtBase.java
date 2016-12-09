package DroneStates;

public class AtBase implements DroneState {
	
	private boolean active = true;
	private DroneFSM droneFSM;


	public AtBase(DroneFSM droneFSM) {
		// TODO Auto-generated constructor stub
		this.droneFSM = droneFSM;
	}


	public void initalize() {
		//System.out.println("Initalizing at Base");

	}


	public void planRecieved() {
		//System.out.println("Plan Received at Base, Searching!");
		droneFSM.setDroneState(droneFSM.searching);
		// TODO Auto-generated method stub

	}


	public void requestVerAssist() {
		//System.out.println("Moving to Assist");
		droneFSM.setDroneState(droneFSM.assisting);

	}

	public void requestComAssist() {
		//System.out.println("Moving to Assist");
		droneFSM.setDroneState(droneFSM.assisting);
		// TODO Auto-generated method stub

	}

	public void returnToBase() {
		//System.out.println("Already at Base!");
		// TODO Auto-generated method stub

	}

	public void verFailed() {
		//System.out.println("Cannot Ver at base");

	}

	public void verSuccess() {
		//System.out.println("Cannot Ver at base");
		// TODO Auto-generated method stub

	}

	public void nearPONR() {
		//System.out.println("Cannot be near PONR while at base");
		// TODO Auto-generated method stub

	}

	public void foundTarget() {
		//System.out.println("Cannot find target while at base");
		// TODO Auto-generated method stub

	}

	public void verAssist() {
		// TODO Auto-generated method stub

	}

	public void comAssist() {
		// TODO Auto-generated method stub

	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive() {
		active = true;
	}
	
	public void setDeactive() {
		active = false;
	}


	@Override
	public void defaultAction() {
		//Power-up, check batteryLevel, and receive mission?
		// TODO Auto-generated method stub
		
	}


	@Override
	public void returnComplete() {
		//System.out.println("The drone has reached the base");
		// TODO Is this when the drone has reached base? 
		// if(drone.atBase == True)
		//		droneState == atBase
		//		being charging
		
	}

	@Override
	public void recharged() {
		//System.out.println("Recharged at Base, Searching!");
		droneFSM.setDroneState(droneFSM.searching);
		//If drone has mission (aka left searching due to PONR), continue 
		//where mission left off?
		
	}

}
