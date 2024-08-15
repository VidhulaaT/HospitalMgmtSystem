package org.example.doctor;

import org.example.diagnosis.Diagnose;

public class DoctorHandler {

    Doctors doctors;


    private Doctor getSpecDoc(String spec){
        for(Doctor d: doctors.doctorList){
            if(d.getSpecialisation().equals(spec)){
                return d;
            }
        }
        return doctors.doctorList.get(doctors.doctorList.size()-1);
    }

    public Doctor diagDoctor(Diagnose d){
        String disorder = d.getDisease();
        return getSpecDoc(disorder);
    }


//    public Doctor getDoctorForDisease(Diagnose d){
//        String specification = "General";
//        specification = d.getDisease();
//        return getSpecDoc(specification);
//    }


//    public Doctor createNewDoc(int id, String name, int exp, String gender, String spec){
//        Doctor newDoc = new Doctor(id,name,exp,gender,spec);
//        doctors.doctorList.add(newDoc);
//        return newDoc;
//    }

//    public void displayAllDoc(){
//        for(Doctor d: doctors.doctorList){
//
//        }
//    }
//
//    public void displayDoc(Doctor doctor){
//        System.out.println("Doctor id : "+doctor.getId());
//        System.out.println("Doctor name : "+doctor.getName());
//        System.out.println("Doctor gender : "+doctor.getGender());
//        System.out.println("Doctor Experience : "+doctor.getYearsOfExp());
//        System.out.println("Specialises in : "+doctor.getSpecialisation());
//        System.out.println();
//    }

//    public void removeDoc(Doctor d){
//        doctors.doctorList.remove(d);
//    }

//    public Doctor updateDocDetails(int id , Doctor doctor){
//        Doctor oldDoctor = doctors.doctorList.stream().filter(doctor1 -> doctor1.getId() == id).findFirst().orElse(null);
//        if(oldDoctor != null){
//            oldDoctor.setName(doctor.getName());
//            oldDoctor.setGender(doctor.getGender());
//            oldDoctor.setSpecialisation(doctor.getSpecialisation());
//            oldDoctor.setYearsOfExp(doctor.getYearsOfExp());
//        }
//        else{
//            oldDoctor = new Doctor(doctor.getId(),doctor.getName(),doctor.getYearsOfExp(),doctor.getGender(),doctor.getSpecialisation());
//        }
//        return oldDoctor;
//    }

}
