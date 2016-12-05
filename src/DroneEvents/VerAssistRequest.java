package DroneEvents;

//AssistConfirmed class that creates an event and listener
public class VerAssistRequest extends Event {
	public VerAssistRequest(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
			
		// TODO Auto-generated method stub
			
	}
}
