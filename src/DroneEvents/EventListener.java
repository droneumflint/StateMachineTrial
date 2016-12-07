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
	public Event getLast(){
		int index = 0;
		Event lastEvent = null;
		if (!eventList.isEmpty()){
			lastEvent = eventList.get(eventList.size()-1);
		}
		return lastEvent;
		
	}

}
