package org.example.patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientHandler {

    public static Scanner sc = new Scanner(System.in);

    //patient entry - add patient
    //check patient
    //remove patient
    //Display patient
    //get details of patient

    List<Patient> patientsList = new ArrayList<>();

    public Patient patientcreation(){
        System.out.println("\t\t Enter the patient details ");
        System.out.println("Patient Id : ");
        int id = sc.nextInt();
        System.out.println("Patient name : ");
        String name = sc.next();
        System.out.println("Patient age : ");
        int age = sc.nextInt();
        System.out.println("Patient gender : ");
        String input = sc.next().toUpperCase();
        Patient.Gender gender = Patient.Gender.valueOf(input);
        System.out.println("Patient blood group : ");
        String bloodGrp = sc.next();

        return createPatient(id,name,age,gender,bloodGrp);
    }

    public Patient createPatient(int id, String name, int age, Patient.Gender gender, String bloodGrp){
        Patient available = checkPatient(id,name,age,gender,bloodGrp);
        if(available != null){
            return available;
        }
        Patient newPatient = new Patient(id,name,age,gender,bloodGrp);
        patientsList.add(newPatient);
        return newPatient;
    }


    public void addPatient(Patient p){
        patientsList.add(p);
    }

    public Patient checkPatient(int id, String name, int age, Patient.Gender gender, String bloodGrp){
        Patient p = patientsList.stream().filter(patient -> patient.getId() == id && patient.getName().equals(name)).findFirst().orElse(null);
        if(p != null){
            return p;
        }
        return null;
    }

//    public void displayAllPatients(){
//        for(Patient pp:patientsList){
//            System.out.println("Patient id : "+pp.getId());
//            System.out.println("Patient name : "+pp.getName());
//            System.out.println("Patient age : "+pp.getAge());
//            System.out.println("Patient gender : "+pp.getGender());
//            System.out.println("Patient blood group : "+pp.getBloodGrp());
//
//        }
//    }

    public Patient getPatientById(int id){
        Patient p = patientsList.stream().filter(patient -> patient.getId() == id).findFirst().orElse(null);
        return p;
    }
    public Patient getPatientByName(String name){
        Patient p = patientsList.stream().filter(patient -> patient.getName().equals(name)).findFirst().orElse(null);
        return p;
    }

    public Patient updatePatientDetails(int id,Patient upPatient){
        Patient oldPatient = patientsList.stream().filter(patient -> patient.getId() == id).findFirst().orElse(null);
//        oldPatient = upPatient;
        if (oldPatient != null) {
            oldPatient.setName(upPatient.getName());
            oldPatient.setAge(upPatient.getAge());
            oldPatient.setGender(upPatient.getGender());
            oldPatient.setBloodGrp(upPatient.getBloodGrp());
            // Copy other fields
        }
        return oldPatient;
    }

    public void removePatient(Patient p){
        patientsList.remove(p);
    }


}
