package DroneEvents;

//Point of No Return class that creates an event and listener
public class PONR extends Event{

	public PONR(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}
}
