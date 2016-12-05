package DroneEvents;

public abstract class Event {
	EventListener eventListener;
	public Event(EventListener eventListener){
		this.eventListener = eventListener; 
		sendToListener();
	}

	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}

}
