package DroneStates;
public class Drone {
	DroneState searching;
	DroneState tracking;
	DroneState assisting;
	DroneState returning;
	DroneState atBase;	
	DroneState dronesState = atBase;
	double batteryLevel = 100;
	static Event currentEvent;
	static EventListener eventListener = new EventListener();
	
	public Drone(){
		searching = new Searching(this);
		tracking = new Tracking(this);
		assisting = new Assisting(this);
		returning = new Returning(this);
		atBase = new AtBase(this);	
	}
	public void setDroneState(DroneState newDroneState){
		dronesState= newDroneState;
	}
	public DroneState getCurrentState(){
		return dronesState;
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
		PlanSent planSent = new PlanSent(eventListener);
		int i =1;
		while (i<10){
			currentEvent = eventListener.eventList.get(eventListener.eventList.size()-1);
		}

		// TODO Auto-generated method stub

	}
	public double returnBatteryLevel(double level){
		batteryLevel = level;
		return level;
	}

}
