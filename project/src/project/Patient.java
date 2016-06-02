package project;

public class Patient {
	boolean hasWorkDoneOn = false;
	boolean isAlive = true;
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return hasWorkDoneOn;
	}
	
	public void isWorkedOn() {
		hasWorkDoneOn = true;
	}

	public void checkPulse() {
		hasWorkDoneOn = true;		
	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return isAlive;
	}

	public void kill() {
		isAlive = false;
		
	}

}
