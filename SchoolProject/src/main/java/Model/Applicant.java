package Model;

import enums.AdmissionStatus;
import enums.Role;


public class Applicant extends Person{
    private AdmissionStatus admissionStatus;
    private double examScores=0;
    private boolean examTaken;


    public Applicant(String name, int age) {
        super(name, age);
    }

    public AdmissionStatus getAdmissionStatus() {
        return this.admissionStatus;
    }

    public void setAdmissionStatus(AdmissionStatus admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public double getExamScores() {
        return this.examScores;
    }


    public void setExamScore(){
        if(examTaken) {
            System.out.println("Scores can't be set again. Exam has already be taken");
          return;
        }
        this.examScores =  (Math.random()*100)+1;
        examTaken = true;
    }



    public boolean isExamTaken() {
        return this.examTaken;
    }



}
