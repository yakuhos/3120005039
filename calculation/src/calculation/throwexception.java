package calculation;

public class throwexception extends Exception{
	public throwexception() {
        super();
    }

    public throwexception(String message) {
        super(message);
    }

    public throwexception(String message, Throwable cause) {
        super(message, cause);
    }

    public throwexception(Throwable cause) {
        super(cause);
    }
}
