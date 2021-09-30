package montyHall;
/**
 * Emuniz11
 * 9/30/2021
 * Daily Programmer Challenge #389 The Monty Hall Problem
 */
public class MHData {
	private Integer winAmount;
	private Integer loseAmount;
	private Double winRate;
	private Integer change;
	
	MHData () {
		winAmount = 0;
		loseAmount = 0;
		winRate = 0.0;
		change = 0;
	}
	
	void addOutcome (int[] v) {
		if (v[0]==1) {
			change++;
		}
		if (v[1]==0) {
			loseAmount++;
		} else if (v[1]==1){
			winAmount++;
		}
	}
	
	Double findRatio () {
		System.out.print("Wins: " + winAmount + "  ");
		System.out.println("Loses: " + loseAmount);
		
		winRate = ((double)winAmount)/((double)loseAmount);
		
		System.out.print("Win rate: ");
		System.out.format("%.2f",winRate);
		System.out.println(" with " + change + " changed choice(s) out of " + (((int)winAmount+(int)loseAmount)));
		
		return winRate;
	}
}
