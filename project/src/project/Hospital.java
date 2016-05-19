package project;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	
	public void addPatient(Patient patient) {
		patients.add(patient);
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		doctors.add(generalPractitioner);
		
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	

}
