package DroneStates;

public class PlanSent extends Event {
	EventListener eventListener;
	public PlanSent(EventListener eventListener){
		this.eventListener = eventListener; 
		sendToListener();
	}

	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}

}
