package exceptions;
public class UnavailableCarException extends RuntimeException{
    public UnavailableCarException(String message) {
        super(message);
    }
}