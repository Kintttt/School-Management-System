package Services;

import Model.*;
import enums.Role;

//public class personsFunctionsImpl extends Person implements personsFunctions{
//    @Override
//    public void expelStudent(Student student, Person principal, Boolean bool) {
//        if(principal.getIdentity() == Role.PRINCIPAL && (student.getStudentScore() < 35 || bool == true)){
//            System.out.println("Yes you can expel " + student.getName());
//        }else{
//            System.out.println("You cannot expel " + student.getName());
//        }
//    }
//
//    @Override
//    public void admitApplicants(Student applicant, Person principal) {
//        if((principal.getIdentity() == Role.PRINCIPAL && applicant.getIdentity() == Role.APPLICANTS) && (applicant.getAge() >= 18 && applicant.getApplicantScore() >= 60)){
//            new Student(applicant.getName(), applicant.getAge(), Role.STUDENTS);
//        }
//    }
//
////    @Override
////    public void takeCourseAndClass(Course course, StudentsAndApplicants student) {
////        if((getIdentity() == Role.STUDENTS  && ){
////
////        }
////    }
//
//    @Override
//    public void FireTeachers(Person hr, Person teacher) {
//        if(hr.getIdentity() == Role.NON_ACADEMIC_STAFF && teacher.getIdentity() == Role.TEACHERS){
//            teacher = null;
//        }else{
//            System.out.println("Not a teacher! You cannot fire " + teacher.getName());
//        }
//
//    }
//
//    @Override
//    public void paySalaryToStaffs(Person hr, Person staff) {
//        if(hr.getIdentity() == Role.NON_ACADEMIC_STAFF && (staff.getIdentity() == Role.TEACHERS || staff.getIdentity() == Role.PRINCIPAL)){
//            System.out.println("Kindly pay "+ staff.getName() + "their monthly salary.");
//        }else{
//            System.out.println("Not a staff! You cannot pay " + staff.getName());
//        }
//
//    }



//}
