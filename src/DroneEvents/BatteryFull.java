package DroneEvents;

public class BatteryFull extends Event{
	public BatteryFull(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
		
		// TODO Auto-generated method stub
		
	}

}
