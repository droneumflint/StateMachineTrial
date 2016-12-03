package DroneStates;
//AssistConfirmed class that creates an event and listener
public class VerSuccess extends Event {
	public VerSuccess(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
			
		// TODO Auto-generated method stub
			
	}
}
