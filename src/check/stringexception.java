package check;

public class stringexception extends Exception{

    /**
	 * 
	 */
	//����warnning
	private static final long serialVersionUID = 1L;

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