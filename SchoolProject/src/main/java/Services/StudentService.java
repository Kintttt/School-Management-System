package Services;


import Model.Course;
import Model.Student;
import exceptions.ExamAlreadyTakenOnCourseException;

import java.util.Formatter;
import java.util.List;
import java.util.Set;


public class StudentService {

    private List<Student> students;
    private Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public StudentService(List<Student> students) {
        this.students = students;
    }


    public void startExamForAllStudents(){

        for(Student student:students){

            try{
                takeExam(student.getCoursesOffered());
            }

            catch (ExamAlreadyTakenOnCourseException exception){
                exception.getMessage();
            }

        }
    }

    public void startExamForStudent(Student student){
        try{
            takeExam(student.getCoursesOffered());
        }

        catch (ExamAlreadyTakenOnCourseException exception){
            exception.getMessage();
        }

    }


    private void takeExam(Set<Course> coursesOffered) throws ExamAlreadyTakenOnCourseException {

        for(Course courseOffered:coursesOffered){
            if(courseOffered.isExamTakenOnCourse()) {
              throw new ExamAlreadyTakenOnCourseException("Exam Has already been taken on this course");

            }
            courseOffered.setCourseScore();
        }
    }



    public String generateResultSheet(Student student){

        if(student.isResultSheetReady()){
             return "Result Ready";
        }
        return "Result Sheet Not Ready Yet..Contact your class teacher for further info...";

    }
    }



