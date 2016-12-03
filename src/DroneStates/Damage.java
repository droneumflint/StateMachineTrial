package DroneStates;
//AssistConfirmed class that creates an event and listener
public class Damage extends Event {
	public Damage(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
			
		// TODO Auto-generated method stub
			
	}
}
