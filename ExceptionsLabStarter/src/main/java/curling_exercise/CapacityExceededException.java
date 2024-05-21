package curling_exercise;

public class CapacityExceededException extends Exception {
    public CapacityExceededException(String message){
        super(message);
    }
    public CapacityExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public CapacityExceededException(Throwable cause) {
        super(cause);
    }

    public CapacityExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}