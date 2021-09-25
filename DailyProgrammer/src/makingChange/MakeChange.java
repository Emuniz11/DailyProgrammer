package makingChange;

/**
 * @author Emuniz11
 * 9/25/2021
 * Daily Programmer Challenge #393 Making Change
 * 
 * The country of Examplania has coins that are worth 
 * 1, 5, 10, 25, 100, and 500 currency units. At the Zeroth Bank 
 * of Examplania, you are trained to make various amounts of 
 * money by using as many ¤500 coins as possible, then as many 
 * ¤100 coins as possible, and so on down.
 * 
 * Write a function to return the number of coins you use to make a 
 * given amount of change.
 */

public class MakeChange {
	
	public static int makeChange (int amount) {
		
		int[] deno = new int[] {1,5,10,25,100,500};
		int index = deno.length-1;
		int hold = amount;
		int coinCount = 0;
		
		System.out.println("Making change for: " + amount);
		
		if (amount==0) {
			System.out.println("You don't have any money!");
			return coinCount;
		}
		
		while(amount<deno[index]) {
			index--;
		}
		
		while (hold>=deno[index]) {
			coinCount++;
			hold-=deno[index];
			while (hold<deno[index] && index!=0) {
				index--;
			}
		}
		
		System.out.println("Your change is " + coinCount + "!");
		
		return coinCount;
		
	}
}
