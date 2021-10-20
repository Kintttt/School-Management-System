package exceptions;

public class ExamNotTakenException extends RuntimeException{

    public ExamNotTakenException(String errorMessage){
        super(errorMessage);
    }
}
