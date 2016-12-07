package DroneEvents;

import java.util.ArrayList;
import java.util.List;

public class EventListener {
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event newEvent){
		eventList.add(newEvent);
		
		
	}
	public List<Event> getList(){
		return eventList;
	}
	public Event getFirst(){
		Event lastEvent = null;
		if (!eventList.isEmpty()){
			lastEvent = eventList.get(0);
		}
		return lastEvent;
		
	}
	public void removeFirst(){
		Event lastEvent = null;
		if (!eventList.isEmpty()){
			lastEvent = eventList.remove(0);
		}
		
	}

}
