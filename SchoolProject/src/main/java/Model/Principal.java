package Model;

import enums.Role;

import java.util.Set;

public class Principal extends Staff{

    private Set<Student> listOfStudents;
    private Set<Applicant> listOfApplicants;
    private Set<Teacher> listOfTeachers;


    public Principal(String name, int age, double salary, Role role) {
        super(name, age, salary, role);
    }

    public Set<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(Set<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public Set<Applicant> getListOfApplicants() {
        return listOfApplicants;
    }

    public void setListOfApplicants(Set<Applicant> listOfApplicants) {
        this.listOfApplicants = listOfApplicants;
    }
}
