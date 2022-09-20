package check;

public class stringexception extends Exception{

    public stringexception() {
        super();
    }

    public stringexception(String message) {
        super(message);
    }

    public stringexception(String message, Throwable cause) {
        super(message, cause);
    }

    public stringexception(Throwable cause) {
        super(cause);
    }
}