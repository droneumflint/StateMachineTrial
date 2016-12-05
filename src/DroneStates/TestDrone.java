package DroneStates;

public class TestDrone {
	 
	

	public static void main(String[] args) {
		DroneFSM droneFSM = new DroneFSM();
		droneFSM.planRecieved();
		droneFSM.nearPONR();
		droneFSM.atBase();
		droneFSM.recharged();
		droneFSM.foundTarget();
		
	}

}
