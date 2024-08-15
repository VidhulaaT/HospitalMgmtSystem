package org.example.doctor;

public class Doctor {

    private String name;
    private int id;
    private int yearsOfExp;
    private String gender;
    private String specialisation;

    public Doctor( int id,String name, int yearsOfExp, String gender, String specialisation) {
        this.name = name;
        this.id = id;
        this.yearsOfExp = yearsOfExp;
        this.gender = gender;
        this.specialisation = specialisation;
    }

    public Doctor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
