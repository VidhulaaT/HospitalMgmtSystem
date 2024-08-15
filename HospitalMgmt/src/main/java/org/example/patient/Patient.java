package org.example.patient;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private int id;
    private String name;
    private int age;
    private String bloodGrp;

    //private String gender;
    public enum Gender{
        MALE,
        FEMALE,
        OTHERS
    }
    private Gender gender;

    List<History> visitedHistory = new ArrayList<>();


    public Patient(int id, String name, int age, Gender gender, String bloodGrp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGrp = bloodGrp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }
}
