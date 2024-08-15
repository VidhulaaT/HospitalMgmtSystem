package org.example.consultation;

import org.example.diagnosis.Diagnose;
import org.example.diagnosis.DiagnoseDisease;
import org.example.doctor.Doctor;
import org.example.doctor.DoctorHandler;

import org.example.patient.Patient;
import org.example.patient.PatientHandler;


public class ConsultationService {

    PatientHandler patientHandler;
    DoctorHandler doctorHandler;
    DiagnoseDisease diagnoseDiseaseHandler;
    Consultation con;
    public ConsultationService(PatientHandler ph, DoctorHandler dh, DiagnoseDisease ddh){
        patientHandler = ph;
        doctorHandler = dh;
        diagnoseDiseaseHandler = ddh;
    }


    public Consultation bookAppointment(){
        Patient p = patientHandler.getPatientById(2);
        Diagnose d = diagnoseDiseaseHandler.getPatientSymptoms();
        Doctor doc = doctorHandler.diagDoctor(d);
        con.setPatient(p);
        con.setDiagnose(d);
        con.setDoctor(doc);
        return con;
    }
}


//    public Consultation bookAppointment() {
//        ph.getPatientById(4);
//        Diagnose x = ddh.diagnoseTheDisease();
//        dh.diagDoctor(x);
//        Consultation()
//    }








