package project;

import java.sql.Date;
import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<>();
	boolean isEvil = false;
	Hospital thisHospital = null;
	
	public Doctor() {
		super();
	}
	
	public Doctor(String ID) {
	if(ID.equals("666")) {
		this.joinTheDarkSide();
	}
}
	public Doctor(String string, Hospital hospital) {
		hospital.add(this);
		thisHospital = hospital;
	}

	public void assignPatient(Patient patient) throws Exception{
		if(assignedPatients.size() >= 3) {
			throw new DoctorFullException("");
		}
		assignedPatients.add(patient);	
	}

	 /*When a patient is killed they move from the Patient list to the Zombie list. 
	 * This will give you the current date and time: new Date().toString()
	*/

	public void doMedicine() {
		for(Patient p: assignedPatients) {
			if(isEvil) {
				p.kill();
				p = new Zombie(new Date(0).toString());
				getPatients().remove(p);
				
			}
			p.isWorkedOn();
		}
		
	}
	public ArrayList<Patient> getPatients() {
		return assignedPatients;
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isEvil() {
		// TODO Auto-generated method stub
		return isEvil;
	}
	public void joinTheDarkSide() {
		isEvil = true;
		
	}

	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return thisHospital;
	}

}
