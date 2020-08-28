package exception.calci;

public class InvalidChoiceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3838823403684932791L;

	InvalidChoiceException(String message)
	{
		super(message);
	}
}
