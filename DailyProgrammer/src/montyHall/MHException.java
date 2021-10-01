package montyHall;

public class MHException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MHException(){
		super("My exception occured!");
	}
	
	public MHException(String msg){
		super(msg);
	}
}
