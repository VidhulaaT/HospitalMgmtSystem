package org.example.diagnosis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DiagnoseDisease {
    public static Scanner sc = new Scanner(System.in);

    public Diagnose diagnose;


    public Diagnose getPatientSymptoms(){
        System.out.println("Enter the symptoms : ");
        List<String> sym = new ArrayList<>();
        sym.add(sc.nextLine());
        sym.add(sc.nextLine());
        sym.add(sc.nextLine());
        sym.add(sc.nextLine());
        diagnose.setDisease(diagnoseTheDisease(sym));
        return diagnose;
    }



    public String diagnoseTheDisease(List<String> smps){
        String res = "General issue";
        List<String> resultList = new ArrayList<>();
        for(Map.Entry<String,List<String>> m:diagnose.symptoms.entrySet()){
            if(m.getValue().containsAll(smps)){
                res = m.getKey();
            }
        }
        return res;
    }
}
