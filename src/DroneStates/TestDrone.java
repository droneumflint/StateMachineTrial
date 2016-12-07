package DroneStates;

import DroneEvents.EventListener;
import DroneEvents.PONR;
import DroneEvents.PlanSent;
import DroneEvents.ReturnComplete;

public class TestDrone {
	private int batteryPercent = 100;
	private double x = 0;
	EventListener eventListener = new EventListener();
	DroneFSM droneFSM = new DroneFSM(eventListener);
	

	public static void main(String[] args) {
		TestDrone o = new TestDrone();
		int time=0;
		while (time<27){
			time++;
			o.droneFSM.update();
			
			if(o.droneFSM.getCurrentState() == o.droneFSM.getSearching()){
				System.out.println("Searching"+o.x);
				if(!o.atPonr()){
					o.move(1);
				};
			}else if(o.droneFSM.getCurrentState() ==o.droneFSM.getReturning()){
				System.out.println("Returning" +o.x);
				if(!o.atBase()){
					o.move(-1);
				};
			}else if(o.droneFSM.getCurrentState() == o.droneFSM.getAssisting()){
				System.out.println("Assisting");
				
			}else if(o.droneFSM.getCurrentState() == o.droneFSM.getTracking()){
				System.out.println("Tracking");
				
			}else if(o.droneFSM.getCurrentState() == o.droneFSM.getAtBase()){
				System.out.println("AtBase");
				o.recharge();
				o.recievePlan();
			}else{
				System.out.println("Dont Know State");
				
			}
			
			
		}
		System.out.println("x distance ="+o.x);
		System.out.println("battery = "+o.getBattery());
		
	}
	
	private void recievePlan() {
		new PlanSent(eventListener);
	}

	public void recharge(){
		batteryPercent=100;
	}
	public int getBattery(){
		return batteryPercent;
	}
	public void move(int distance){
		x= x+distance;
		batteryPercent= batteryPercent-Math.abs(distance);
	}
	public boolean atPonr(){
		boolean val = false;
		if (batteryPercent<90){
			new PONR(eventListener);
			val = true;
		}
		return val;
	}
	public boolean atBase(){
		boolean val = false;
		if (x==0){
			new ReturnComplete(eventListener);
			 val = true;
		}
		return val;
	}
	
	

}
