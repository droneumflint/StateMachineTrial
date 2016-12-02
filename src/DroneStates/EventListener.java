package DroneStates;

import java.util.ArrayList;
import java.util.List;

public class EventListener {
	public List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event newEvent){
		eventList.add(newEvent);
		
		
	}

}
