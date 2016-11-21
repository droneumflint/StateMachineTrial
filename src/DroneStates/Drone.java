package DroneStates;
public class Drone {
	DroneState searching;
	DroneState tracking;
	DroneState assisting;
	DroneState returning;
	DroneState atBase;
	
	DroneState droneState;
	public Drone(){
		searching = new Searching(this);
		tracking = new Tracking(this);
		assisting = new Assisting(this);
		returning = new Returning(this);
		atBase = new AtBase(this);
		
		
		
		
	}
	public void setDroneState(DroneState newDroneState){
		droneState= newDroneState;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
