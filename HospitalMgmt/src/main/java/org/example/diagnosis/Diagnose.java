package org.example.diagnosis;

import java.util.*;

public class Diagnose {


    private String disease;
    public Map<String, List<String>> symptoms = new HashMap<>();


    public Diagnose(){
        //Dermatology
        symptoms.put("Dermatology",new ArrayList<>(Arrays.asList("moles","scars","skin allergies","acne","rashes")));
        //Cardiology
        symptoms.put("Cardiology",new ArrayList<>(Arrays.asList("palpitations","high blood pressure","chest pain","breathlessness","feeling dizzy")));
        //Rheumatology
        symptoms.put("Rheumatology",new ArrayList<>(Arrays.asList("back pain","joint pain","joint swelling","joint stiffness","redness in joints")));
        //Ophthalmology
        symptoms.put("Ophthalmology",new ArrayList<>(Arrays.asList("eye pain","eye irritation","vision loss","eye floaters","redness of eye")));
        //Neurology
        symptoms.put("Neurology",new ArrayList<>(Arrays.asList("difficulty in walking","loss of balance","paralysis","stroke","headache")));

    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

