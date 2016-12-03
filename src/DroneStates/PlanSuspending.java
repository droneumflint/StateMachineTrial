package DroneStates;
//AssistConfirmed class that creates an event and listener
public class PlanSuspending extends Event {
	public PlanSuspending(EventListener eventListener) {
		super(eventListener);
		// TODO Auto-generated constructor stub
	}
	private void sendToListener() {
		eventListener.addEvent(this);
			
		// TODO Auto-generated method stub
			
	}
}
