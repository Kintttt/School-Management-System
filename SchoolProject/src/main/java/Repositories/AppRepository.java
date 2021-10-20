package Repositories;

import Model.Applicant;
import Model.Staff;
import Model.Student;
import data.DataSource;

public class AppRepository{


    private DataSource dataSource;

    public AppRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }


    public void registerApplicant(Applicant applicant){
        dataSource.getListOfApplicants().add(applicant);
    }

    public void admitStudent(Student student){
        dataSource.getListOfStudentsInSchool().add(student);
    }

    public long studentsSize(){
       return dataSource.getListOfStudentsInSchool().size();
    }

    public  void addStaff(Staff staff){
        dataSource.getListOfStaffsInSchool().add(staff);
    }

    public void deleteStaff(Staff staff){
        dataSource.getListOfStaffsInSchool().remove(staff);
    }

    public void deleteStudent(Student student){
        dataSource.getListOfStudentsInSchool().remove(student);

    }


}
