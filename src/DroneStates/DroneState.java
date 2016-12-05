package DroneStates;

public interface DroneState {
	
	void initalize();
	void planRecieved();
	void requestVerAssist();
	void requestComAssist();
	void returnToBase();
	void verFailed();
	void verSuccess();
	void nearPONR();
	void foundTarget();
	void verAssist();
	void comAssist();
	void atBase();
	void recharged();
	void defaultAction();
	
	boolean isActive();
	void setActive();
	void setDeactive();

}
