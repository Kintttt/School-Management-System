package Services;

import Model.*;

public interface personsFunctions {

    void expelStudent(Student student, Person principal, Boolean bool);
    void admitApplicants(Student applicant, Person principal);
    void takeCourseAndClass(Course course, Student student);
    void FireTeachers(Person hr, Person teacher);
    void paySalaryToStaffs(Person hr, Person staff);
}
