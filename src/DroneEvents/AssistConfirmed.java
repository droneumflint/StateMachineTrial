package DroneEvents;

//AssistConfirmed class that creates an event and listener
public class AssistConfirmed extends Event {
	public AssistConfirmed(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}

}
