package Services;

import Model.Applicant;
import java.util.List;


public class ApplicantService {

    private List<Applicant> applicants;

    public ApplicantService(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public ApplicantService(Applicant applicant){
        takeExam(applicant);
    }

    public void startExam(){
      for(Applicant applicant:applicants){
        takeExam(applicant);
      }
    }

    private void takeExam(Applicant applicant){

        if(applicant.isExamTaken()) {
            System.out.println("Applicant has already taken exam");
            return;  }
          applicant.setExamScore();
    }
    }



