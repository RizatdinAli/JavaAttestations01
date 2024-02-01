package src.exceptions;

public class InvalidPasswordException extends RuntimeException {
    private String message;

    public InvalidPasswordException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}