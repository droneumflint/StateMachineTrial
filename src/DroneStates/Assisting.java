package DroneStates;

public class Assisting implements DroneState {
	
	private boolean active = false;
	private DroneFSM droneFSM;

	public Assisting(DroneFSM droneFSM) {
		this.droneFSM = droneFSM;
		// TODO Auto-generated constructor stub
	}

	public void initalize() {
		System.out.println("Cannot init while Assisting");
		// TODO Auto-generated method stub

	}

	public void planRecieved() {
		System.out.println("Cannot receivePlan while Assisting");
		// TODO Auto-generated method stub

	}

	public void requestVerAssist() {
		// TODO Auto-generated method stub

	}

	public void requestComAssist() {
		System.out.println("Already Assisting");
		// TODO Auto-generated method stub

	}

	public void returnToBase() {
		//After nearPONR has been raised and relief drone has arrived,
		System.out.println("Relief drone has arrived, moving to base");
		droneFSM.setDroneState(droneFSM.returning);

	}
	public void verFailed() {
		// TODO Auto-generated method stub

	}
	public void verSuccess() {
		// TODO Auto-generated method stub

	}
	public void nearPONR() {
		System.out.println("Almost Dead, need to return to Base, but I need relief!");
		//Need to raise a relief event before returning
		//In this case you want to raise the nearPONR event earlier since this
		//proxy drone can't leave until relief drone arrives(unless we're okay
		//with a momentary break in comm)
	}
	public void foundTarget() {
		System.out.println("Shouldn't be searching while Assisting");
	}

	public void verAssist() {
		System.out.println("Already Assisting");
		// TODO Auto-generated method stub

	}

	public void comAssist() {
		System.out.println("The drone I'm assisting needs to go out further, someone come assist me!");
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
		//Follow drone that requested the assistance
	}

	@Override
	public void returnComplete() {
		//It's only mission is to follow the requester, so when requester drone
		//changes from searching/tracking to returning, this is when the assisting
		//should conclude		
	}

	
	@Override
	public void recharged() {
		System.out.println("Doesn't make Sense!");
		// TODO Auto-generated method stub
		
	}

}
