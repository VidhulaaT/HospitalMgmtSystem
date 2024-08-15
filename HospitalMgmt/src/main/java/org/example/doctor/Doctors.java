package org.example.doctor;

import java.util.ArrayList;
import java.util.List;

public class Doctors {

    public List<Doctor> doctorList = new ArrayList<>();

    public Doctors(){
        doctorList.add(new Doctor(1,"Vimal",3,"Male","Dermatology"));
        doctorList.add(new Doctor(2,"Malar",5,"Female","Cardiology"));
        doctorList.add(new Doctor(3,"Boorni",4,"Female","Rheumatology"));
        doctorList.add(new Doctor(4,"Yadhav",2,"Male","Opthalmology"));
        doctorList.add(new Doctor(5,"Anush",1,"Male","Neurology"));
        doctorList.add(new Doctor(6,"Pavi",1,"Female","General"));

    }
    public Doctor createNewDoc(int id, String name, int exp, String gender, String spec){
        Doctor newDoc = new Doctor(id,name,exp,gender,spec);
        doctorList.add(newDoc);
        return newDoc;
    }
    public void removeDoc(Doctor d){
        doctorList.remove(d);
    }
    public Doctor updateDocDetails(int id , Doctor doctor){
        Doctor oldDoctor = doctorList.stream().filter(doctor1 -> doctor1.getId() == id).findFirst().orElse(null);
        if(oldDoctor != null){
            oldDoctor.setName(doctor.getName());
            oldDoctor.setGender(doctor.getGender());
            oldDoctor.setSpecialisation(doctor.getSpecialisation());
            oldDoctor.setYearsOfExp(doctor.getYearsOfExp());
        }
        else{
            oldDoctor = new Doctor(doctor.getId(),doctor.getName(),doctor.getYearsOfExp(),doctor.getGender(),doctor.getSpecialisation());
        }
        return oldDoctor;
    }
}
