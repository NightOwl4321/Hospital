package project;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<>();
	public void assignPatient(Patient patient) throws Exception{
		if(assignedPatients.size() >= 3) {
			throw new DoctorFullException("");
		}
		assignedPatients.add(patient);	
	}
	public void doMedicine() {
		for(Patient p: assignedPatients) {
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

}
