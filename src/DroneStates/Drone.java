package DroneStates;
public class Drone {
	DroneState searching;
	DroneState tracking;
	DroneState assisting;
	DroneState returning;
	DroneState atBase;	
	DroneState dronesState = atBase;
	static double batteryLevel = 100; //changed this to static
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
			System.out.println("Hey look I created an eventListener and appended to eventList");
			i++;
		}
		//This while loop tests PONR functionality, batteryLevel starts at 100
		//and decrements by 25 until reaching 50
		while (batteryLevel > 50 ){
			batteryLevel -= 25;
			if(batteryLevel == 50){
				PONR PONR = new PONR(eventListener);
				currentEvent = eventListener.eventList.get(eventListener.eventList.size()-1);
				System.out.println("Low on fuel! Returning to base!");
			}
			
			
		}
		// TODO Auto-generated method stub

	}
	public double returnBatteryLevel(double level){
		batteryLevel = level;
		return level;
	}

}
