package Model;

import enums.Level;
import java.util.Set;

public class Student extends Person {

    private Set<Course> coursesOffered;
    private Level studentLevel;
    private boolean hasMalpracticeCase;
    private boolean resultSheetReady;
    private  long StudentId;

    public boolean isResultSheetReady() {
        return resultSheetReady;
    }

    public void setResultSheetReady(boolean resultSheetReady) {
        this.resultSheetReady = resultSheetReady;
    }

    public Student(String name, int age, Set<Course> coursesOffered, Level studentLevel,long studentId) {
        super(name, age);
        this.coursesOffered = coursesOffered;
        this.studentLevel = studentLevel;
        this.hasMalpracticeCase = false;
        this.resultSheetReady = false;
        this.StudentId = studentId;
    }

    public Set<Course> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(Set<Course> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Level getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(Level studentLevel) {
        this.studentLevel = studentLevel;
    }

    public boolean isHasMalpracticeCase() {
        return hasMalpracticeCase;
    }

    public void setHasMalpracticeCase(boolean hasMalpracticeCase) {
        this.hasMalpracticeCase = hasMalpracticeCase;
    }
}
