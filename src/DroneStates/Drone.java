package DroneStates;
public class Drone {
	static DroneState searching;
	static DroneState tracking;
	static DroneState assisting;
	static DroneState returning;
	static DroneState atBase;	
	static DroneState dronesState = atBase;
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
	public static void setDroneState(DroneState newDroneState){
		dronesState= newDroneState;
	}
	public static DroneState getCurrentState(){
		return dronesState;
		}
	public void initalize() {
		// TODO Auto-generated method stub
		setDroneState(atBase);
		System.out.println("Drone Currently at Base");

	}

	public static void planRecieved() {
		// TODO Auto-generated method stub
		setDroneState(searching);
		System.out.println("Drone Currently Searching");
	}

	public void requestVerAssist() {
		// TODO Auto-generated method stub
		setDroneState(tracking);
		System.out.println("Drone Currently Tracking");
	}

	public void requestComAssist() {
		// TODO Auto-generated method stub
		setDroneState(searching);
		System.out.println("Drone Currently Searching");
	}

	public void returnToBase() {
		// TODO Auto-generated method stub
		setDroneState(atBase);
		System.out.println("Drone Currently at Base");
	}

	public void verFailed() {
		// TODO Auto-generated method stub
		setDroneState(searching);
		System.out.println("Drone Currently Searching");
	}
	public void verSuccess() {
		// TODO Auto-generated method stub
		setDroneState(tracking);
		System.out.println("Drone Currently Tracking");
	}
	public static void nearPONR() {
		// TODO Auto-generated method stub
		setDroneState(returning);	//Set drone state to returning
		System.out.println("Drone Currently Returning");
	}

	
	public void foundTarget() {
		// TODO Auto-generated method stub
		setDroneState(tracking);
		System.out.println("Drone Currently Tracking");
	}

	public void verAssist() {
		// TODO Auto-generated method stub
		setDroneState(tracking);
		System.out.println("Drone Currently Tracking");
	}

	public void comAssist() {
		// TODO Auto-generated method stub
		//Inside of searching
	}

	public static void main(String[] args) {
		if (dronesState == atBase){
			PlanSent planSent = new PlanSent(eventListener);
				currentEvent = eventListener.eventList.get(eventListener.eventList.size()-1);
				System.out.println(currentEvent);
				planRecieved();
				
		}
		
		//This while loop tests PONR functionality, batteryLevel starts at 100
		//and decrements by 25 until reaching 50
		while (batteryLevel > 50 ){
			batteryLevel -= 25;
			if(batteryLevel == 50){
				PONR PONR = new PONR(eventListener); //Fire event
				currentEvent = eventListener.eventList.get(eventListener.eventList.size()-1);
				System.out.println(currentEvent);
				nearPONR();
			}
						
		}
	
	}
		// TODO Auto-generated method stub
	

	public double returnBatteryLevel(double level){
		batteryLevel = level;
		return level;
	}
}
