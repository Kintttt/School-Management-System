package exceptions;

public class ExamAlreadyTakenOnCourseException extends RuntimeException{


    public  ExamAlreadyTakenOnCourseException(String message){
        super(message);
    }
}
