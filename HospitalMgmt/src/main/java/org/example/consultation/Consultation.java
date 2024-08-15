package org.example.consultation;

import org.example.diagnosis.Diagnose;
import org.example.doctor.Doctor;
import org.example.patient.Patient;

public class Consultation {

    private Patient patient;
    private Doctor doctor;
    public Diagnose diagnose;
//    public Doctors doctors;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }


}
