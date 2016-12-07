package DroneStates;

public class Assisting implements DroneState {
	
	private boolean active = false;

	public Assisting(DroneFSM drone) {
		// TODO Auto-generated constructor stub
	}

	public void initalize() {
		// TODO Auto-generated method stub

	}

	public void planRecieved() {
		// TODO Auto-generated method stub

	}

	public void requestVerAssist() {
		// TODO Auto-generated method stub

	}

	public void requestComAssist() {
		// TODO Auto-generated method stub

	}

	public void returnToBase() {
		// TODO Auto-generated method stub

	}
	public void verFailed() {
		// TODO Auto-generated method stub

	}
	public void verSuccess() {
		// TODO Auto-generated method stub

	}
	public void nearPONR() {
		// TODO Auto-generated method stub

	}
	public void foundTarget() {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnComplete() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void recharged() {
		// TODO Auto-generated method stub
		
	}

}
