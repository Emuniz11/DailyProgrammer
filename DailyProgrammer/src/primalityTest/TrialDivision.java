package primalityTest;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Emuniz
 * 9/22/2021
 * This program uses a simple Primality test called Trial Division
 * to find prime numbers up to a certain limit chosen by the user.
 * Planned use case is RSA key generation specifically to choose two distinct prime numbers p and q
 */

public class TrialDivision {
	
	public static int findPrime (int limit) {
		//Ideas:
		//change array list to Double 
		//find a random number generator for Double
		//round Double to choose prime in array or cast to Integer
		//remove parameters to have a built in limit
		
		// ArrayList will store the prime numbers found up to the given limit
		ArrayList<Integer> found = new ArrayList<Integer>();
		// chosenPrime is for storing the random prime number (future update with SecureRandom or other)
		int chosenPrime = 0;
		// flag value stays 0 if number being tested has factorial
		int flag = 0;
		int m = 0;
		// Random e is used to choose a prime number from the ArrayList
		// Think about updating to SecureRandom or computer time to generate random number
		Random rand = new Random();
		
		System.out.println("Finding prime numbers up to " + limit);
		// This loop will iterate up to the limit from the user
		for (int i=0;i<=limit;i++) {
			// Flag needs to be reset through every loop
			flag = 0;
			// Note: the factor of any given number is always less than or equal to number/2
			// so the value of m will be the upper limit of what factors are possible
			m = i/2;
			if (i == 0 || i == 1) {
				//System.out.println(i + " is not a prime number.");
			}
			else {
				for (int v=2;v<=m;v++) {
					// If 0 is the remainder after modulus, then v is a factor of i
					// A number is only divisible by another number if there is no remainder 
					if (i%v==0) {
						//System.out.println(i + " is not a prime number.");
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					System.out.println(i + " is prime!");
					found.add(i);
				}
			}
		}
		
		int e = rand.nextInt(found.size());
		chosenPrime = found.get(e);
		//Debugging
		//System.out.println("Array size = " + found.size());
		System.out.println("Random Index = " + (e+=1));
		System.out.println("Prime chosen: " + chosenPrime);
		//Return a (sudo)random prime number
		return chosenPrime;
	}
	
}
