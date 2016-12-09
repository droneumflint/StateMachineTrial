package DroneStates;

public class Tracking implements DroneState {
	
	private boolean active = false;
	private DroneFSM droneFSM;

	public Tracking(DroneFSM droneFSM) {
		this.droneFSM = droneFSM;
		// TODO Auto-generated constructor stub
	}
	
	public void initalize() {
		// TODO Auto-generated constructor stub
	}
	
	public void planRecieved() {
		System.out.println("Doesn't make Sense!");
	}

	public void requestVerAssist() {
		//If you're in tracking, didn't you already ver target?
		System.out.println("Doesn't make Sense!");
	}

	public void requestComAssist() {
		//Trigger a Utility function for an assistant to become proxy
		System.out.println("I need to move out of com range, need a proxy");
	}

	public void returnToBase() {
		//Should only trigger on missionComplete
		System.out.println("But I think this is my target, ignore PONR and damaged!");
		droneFSM.setDroneState(droneFSM.returning);
	}

	public void verFailed() {
		//If you're tracking, didn't ver already succeed?
	}

	public void verSuccess() {
		//If you're tracking, didn't ver already succeed?
	}

	public void nearPONR() {
		//Ignore, since tracking target is more important
		System.out.println("Tracking target is more important than my life!");
	}

	public void foundTarget() {
		//If you're tracking you already found the target correct?
	}

	public void verAssist() {
		//If you're in Tracking, you've already verified your target 
		System.out.println("Doesn't make Sense!");
	}

	public void comAssist() {
		//run Utility function to get assistant
		//Problem? If you're tracking & need to leave com range, wouldn't you
		//have to either continue following target and break com OR stop moving
		//(to maintain com range) and potentially lose target
		System.out.println("I need to leave com range, someone assist me!");
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
		//Follow target
	}
	@Override
	public void returnComplete() {
		//Only return when mission is complete
		System.out.println("Moving to Returning");
		droneFSM.setDroneState(droneFSM.returning);
	}
	@Override
	public void recharged() {
		System.out.println("Doesn't make Sense!");	
	}

}
