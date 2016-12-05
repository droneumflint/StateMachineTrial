package DroneStates;

import DroneEvents.Event;
import DroneEvents.EventListener;

public class PlanSent extends Event {
	public PlanSent(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}


	EventListener eventListener;
	

	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}

}
