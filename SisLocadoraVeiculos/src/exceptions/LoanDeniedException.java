package exceptions;
public class LoanDeniedException extends RuntimeException{
    public LoanDeniedException(String message) {
        super(message);

    }

}