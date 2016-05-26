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

	// here
	public void assignPatientsToDoctors() {
		int i = 0;
		for (Doctor d: doctors) {
			while (i < patients.size()- 1) {
				try {
					d.assignPatient(patients.get(i));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace(); no
					i++;
				}

			}
		}
		// TODO Auto-generated method stub

	}

}
