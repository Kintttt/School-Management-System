package data;

import Model.Applicant;
import Model.Staff;
import Model.Student;

import java.util.HashSet;
import java.util.Set;

public class DataSource {

    private Set<Student> listOfStudentsInSchool;
    private Set<Staff>   listOfStaffsInSchool;
    private Set<Applicant> listOfApplicants;

    public DataSource(){
        this.listOfStudentsInSchool = new HashSet<>();
        this.listOfApplicants = new HashSet<>();
        this.listOfStaffsInSchool = new HashSet<>();
    }

    public HashSet<Student> getListOfStudentsInSchool() {
        return (HashSet<Student>) listOfStudentsInSchool ;
    }

    public Set<Staff> getListOfStaffsInSchool() {
        return listOfStaffsInSchool;
    }

    public Set<Applicant> getListOfApplicants() {
        return listOfApplicants;
    }







}
