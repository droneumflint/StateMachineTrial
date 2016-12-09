package DroneStates;

import DroneEvents.*;


public class TestDrone {
	private int batteryPercent = 100;
	private double x = 0;
	EventListener eventListener = new EventListener();//Each Drone Has one event listener
	DroneFSM droneFSM = new DroneFSM(eventListener);
	

	public static void main(String[] args) {
		TestDrone o = new TestDrone();
		int time=0;
		o.recievePlan();
		while (time<27){
			time++;
			o.updateEvents();	
			o.droneActions();
			
		}
		System.out.println("x distance ="+o.x);
		System.out.println("battery = "+o.getBattery());
		
	}
	//Checks For events that should trigger
	private void updateEvents() {
		atPonr();
		atBase();
		isBatteryFull();
		droneFSM.update();
		
	}
	//For Each Drone State, says the actions should perform
	private void droneActions(){
		if(droneFSM.getCurrentState() == droneFSM.getSearching()){
			System.out.println("Searching"+x);
				move(1);
		}else if(droneFSM.getCurrentState() ==droneFSM.getReturning()){
			System.out.println("Returning" +x);
			move(-1);
		}else if(droneFSM.getCurrentState() == droneFSM.getAssisting()){
			System.out.println("Assisting");
			
		}else if(droneFSM.getCurrentState() == droneFSM.getTracking()){
			System.out.println("Tracking");		
		}else if(droneFSM.getCurrentState() == droneFSM.getAtBase()){
			System.out.println("AtBase");
			recharge();
		}else{
			System.out.println("Dont Know State");
		}
	}
	
	//Creates BatteryFull Event if battery is full
	private void isBatteryFull() {
		if (getBattery() == 100){
			new BatteryFull(eventListener);
		}
	}
	//Creates Plan Sent Event 
	private void recievePlan() {
		new PlanSent(eventListener);
	}
	//Sets the Drone Batttery to full
	
	public int getBattery(){
		return batteryPercent;
	}
	public void recharge(){
		batteryPercent=100;
	}
	// move in one dimension
	public void move(int distance){
		x= x+distance;
		batteryPercent= batteryPercent-Math.abs(distance);
	}
	//Creates PONR Event if at PONR
	public boolean atPonr(){
		boolean val = false;
		if (batteryPercent<90){
			val = true;
		}
		return val;
	}
	//Creates AtBase Event if at Base
	public boolean atBase(){
		boolean val = false;
		if (x==0){
			new ReturnComplete(eventListener);
			 val = true;
		}
		return val;
	}
	
	

}
