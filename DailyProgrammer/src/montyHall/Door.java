package montyHall;

/**
 * Emuniz11
 * 9/30/2021
 * Daily Programmer Challenge #389 The Monty Hall Problem
 */

public class Door {
	private Boolean status;
	private Boolean prize;
	
	Door (Boolean s, Boolean p) {
		status = s;
		prize = p;
	}
	
	void open () {
		status = true;
	}
	
	void placePrize () {
		prize = true;
	}
	
	Boolean checkStatus () {
		return status;
	}
	
	Boolean checkPrize () {
		return prize;
	}
	
	
}
