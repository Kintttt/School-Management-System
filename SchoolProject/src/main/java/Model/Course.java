package Model;

import enums.Grade;
import enums.Level;
import exceptions.ExamNotTakenException;

public class Course {

    private String courseName;
    private Level classLevel;
    private Grade courseGrade;
    private double courseScore = 0;
    private boolean examTakenOnCourse = false;

    public double getCourseScore() {
        return courseScore;
    }

    public void setCourseScore() {
        if(examTakenOnCourse){

        }
        this.courseScore =  (Math.random()*100)+1;
        examTakenOnCourse = true;
    }



    public boolean isExamTakenOnCourse() {
        return examTakenOnCourse;
    }


    public Grade getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Grade courseGrade) throws ExamNotTakenException {
        if(!examTakenOnCourse) throw new ExamNotTakenException("Exam Has not been written on this course");
        this.courseGrade = courseGrade;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    private int scores = 0;

    public Course(String courseName, Level classLevel) {
        this.courseName = courseName;
        this.classLevel = classLevel;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Level getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(Level classLevel) {
        this.classLevel = classLevel;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", classLevel=" + classLevel +
                '}';
    }
}
