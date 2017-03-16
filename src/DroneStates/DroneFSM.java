package DroneStates;

import DroneEvents.*;


public class DroneFSM {
	DroneState searching;
	DroneState tracking;
	DroneState assisting;
	DroneState returning;
	DroneState atBase;	
	DroneState dronesState;
	private EventListener eventListener;
	
	
	public DroneFSM(EventListener eventListener){
		this.eventListener =eventListener;
		searching = new Searching(this);
		tracking = new Tracking(this);
		assisting = new Assisting(this);
		returning = new Returning(this);
		atBase = new AtBase(this);	
		dronesState = atBase;
	}
	public void setDroneState(DroneState newDroneState){
		dronesState= newDroneState;
	}
	public DroneState getCurrentState(){
		return dronesState;
		}
	public void initalize() {
		// TODO Auto-generated method stub
		dronesState.initalize();
	

	}

	public void planRecieved() {
		// TODO Auto-generated method stub
		dronesState.planRecieved();
		//System.out.println("Drone Currently Plans Recieved in state: " + dronesState);
	}

	public void requestVerAssist() {
		// TODO Auto-generated method stub
		dronesState.requestVerAssist();
		//System.out.println("Drone Currently Tracking");
	}

	public void requestComAssist() {
		// TODO Auto-generated method stub
		dronesState.requestComAssist();
		//System.out.println("Drone Currently Searching");
	}

	public void returnToBase() {
		// TODO Auto-generated method stub
		dronesState.returnToBase();
		//System.out.println("Drone Currently at Base");
	}

	public void verFailed() {
		// TODO Auto-generated method stub
		dronesState.verFailed();
		//System.out.println("Drone Currently Searching");
	}
	public void verSuccess() {
		// TODO Auto-generated method stub
		dronesState.verSuccess();
		//System.out.println("Drone Currently Tracking");
	}
	public void nearPONR() {
		// TODO Auto-generated method stub
		dronesState.nearPONR();	//Set drone state to returning
		//System.out.println("Drone Currently Returning");
	}

	
	public void foundTarget() {
		// TODO Auto-generated method stub
		dronesState.foundTarget();
		//System.out.println("Drone Currently Tracking");
	}

	public void verAssist() {
		// TODO Auto-generated method stub
		dronesState.verAssist();
		//System.out.println("Drone Currently Tracking");
	}

	public void comAssist() {
		dronesState.comAssist();
		//Inside of searching
	}
	public void recharged() {
		dronesState.recharged();
	}
	public void returnComplete() {
		dronesState.returnComplete();
	}
	
	
	
	public DroneState getSearching() { return searching; }
	public DroneState getTracking() { return tracking; }
	public DroneState getAssisting() { return assisting; }
	public DroneState getReturning() { return returning; }
	public DroneState getAtBase() { return atBase; }
	
	
	public void update(){
		for(int i = 0; i< eventListener.getList().size(); i=i){
			if (eventListener.getFirst() instanceof PONR){
				nearPONR();
				
			}else if(eventListener.getFirst() instanceof PlanSent){
				planRecieved();
			}else if(eventListener.getFirst() instanceof ReturnComplete){
				returnComplete();
			}
			else if(eventListener.getFirst() instanceof BatteryFull){
				recharged();
			}
			else if(eventListener.getFirst() instanceof PossibleTarget){
				foundTarget();
			}
			else if(eventListener.getFirst() instanceof RespondingToRequest){
				requestVerAssist();
			}
			eventListener.removeFirst();			
		}		
	}

	
	/*public static void main(String[] args) {
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
	}*/
}
