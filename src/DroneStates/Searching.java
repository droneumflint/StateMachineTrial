package DroneStates;

public class Searching implements DroneState {
	
	private boolean active = false;
	private DroneFSM droneFSM;

	public Searching(DroneFSM droneFSM) {
		this.droneFSM = droneFSM;
		// TODO Auto-generated constructor stub
	}

	public void initalize() {
		System.out.println("Cannot init while Searching");

	}

	public void planRecieved() {
		System.out.println("Cannot change plans while Searching");
		// TODO Auto-generated method stub

	}

	public void requestVerAssist() {
		System.out.println("Moving to Assist");
		droneFSM.setDroneState(droneFSM.assisting);
		// TODO Auto-generated method stub

	}
	public void requestComAssist() {
		System.out.println("Moving to Assist");
		droneFSM.setDroneState(droneFSM.assisting);
		// TODO Auto-generated method stub

	}
	public void returnToBase() {
		System.out.println("Moving to Base");
		droneFSM.setDroneState(droneFSM.returning);
		// TODO Auto-generated method stub

	}
	public void verFailed() {
		// TODO Auto-generated method stub

	}
	public void verSuccess() {
		System.out.println("Moving to Track Target");
		droneFSM.setDroneState(droneFSM.tracking);
		// TODO Auto-generated method stub

	}

	public void nearPONR() {
		System.out.println("Almost Dead Moving to Base");
		droneFSM.setDroneState(droneFSM.returning);

	}

	public void foundTarget() {
		System.out.println("Moving to Track Target");
		droneFSM.setDroneState(droneFSM.tracking);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnComplete() {
		//System.out.println("Doesnt make Sense");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void recharged() {
		// TODO Auto-generated method stub
		
	}
}
