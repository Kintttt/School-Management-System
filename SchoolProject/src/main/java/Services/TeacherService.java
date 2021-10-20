package Services;

import Model.Course;
import Model.Student;
import Model.Teacher;
import enums.Grade;

import java.util.Set;

public class TeacherService {


    private Teacher teacher;
    private  StudentService studentService;

    public TeacherService(Teacher teacher,StudentService studentService){
        this.teacher = teacher;
        this.studentService = studentService;
    }


    public void invigilateStudents(){
      studentService.startExamForAllStudents();
    }


    public void gradeStudents(){

        Set<Course> studentCourses = null;
        for(Student student:teacher.getListOfStudents()){
            studentCourses = student.getCoursesOffered();
        }

        for(Course studentCourse: studentCourses){
           setGrades(studentCourse.getScores(),studentCourse);
        }
    }

    private void  setGrades(int scores,Course studentCourse){


        if(scores<40){
            studentCourse.setCourseGrade(Grade.F);
            return;
        }
        if(scores>=40 && scores<45){
            studentCourse.setCourseGrade(Grade.E);
            return;
        }

        if(scores>=45 && scores<50){
            studentCourse.setCourseGrade(Grade.D);
            return;
        }
        if(scores>=50 && scores<60){
            studentCourse.setCourseGrade(Grade.C);
            return;
        }
        if(scores>=60 && scores<70){
            studentCourse.setCourseGrade(Grade.B);
            return;
        }
        if(scores>=70){
            studentCourse.setCourseGrade(Grade.A);
            return;
        }
    }
}
