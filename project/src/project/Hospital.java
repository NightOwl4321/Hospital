package project;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	ArrayList<Patient> zombies = new ArrayList<>(); 

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

	public void assignPatientsToDoctors() {
		int patientsCounter = 0;
		int patientsPerDoctor = patients.size()/doctors.size();
		int remainder = patients.size()%doctors.size();
		while(patientsCounter < patients.size()) {
			for(Doctor d: doctors) {
				try {
					d.assignPatient(patients.get(patientsCounter));
					patientsCounter++;
				} catch (Exception e) {
					
				}
			}
		}
	}

	public void add(Object obj) {
		if(obj instanceof Patient)
			patients.add((Patient) obj);
		else if(obj instanceof Doctor)
			doctors.add((Doctor) obj);
		
	}

		public void makeDoctorsWork() {
		for(Doctor d: doctors) {
			d.doMedicine();
		}
		
		
	}

	public List<Patient> getZombies() {
		// TODO Auto-generated method stub
		return zombies;
	}
	
	public void patientsToZombies() {
		for(Patient p: patients) {
			if(!p.isAlive) {
			zombies.add(p);
			patients.remove(p);
			}
		}
	}

}
