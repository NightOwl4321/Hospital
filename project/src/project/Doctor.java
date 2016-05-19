package project;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> assignedPatients = new ArrayList<>();
	public void assignPatient(Patient patient) {
		assignedPatients.add(patient);	
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}
