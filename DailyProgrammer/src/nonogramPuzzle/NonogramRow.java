package nonogramPuzzle;

import java.util.ArrayList;

/**
 * @author Emuniz
 * 9/21/2021
 * Daily Programmer Challenge #395 Nonogram Puzzle
 * 
 * A binary array is an array consisting of only the values 0 and 1. 
 * Given a binary array of any length, return an array of positive integers 
 * that represent the lengths of the sets of consecutive 1's in the input array, 
 * in order from left to right.
 */

public class NonogramRow {
	
	public void countAppear(ArrayList<Integer> a) {
		// This List will hold the count of 1s in a row
		ArrayList<Integer> hold = new ArrayList<Integer>();
		// This variable will count how many 1s are in a row
		int count = 0;
		// Used for loop because iterating through the binary list is necessary
		for (int i=0;i<a.size();i++) {
			// This block will determine how many time count should be incremented 
			//and will also reset count when a 0 is found in the next element
			if(a.get(i)==1) {
				count++;
				// try is used to handle IndexOutofBound exception when comparing the next element
				try {
					if(a.get(i+1)==0 && a.get(i)==1) {
						hold.add(count);
						count=0;
					}
				}
				catch(Exception e){
					if(a.get(i)==1) hold.add(count);
				}
			}
		}
		printAppear(hold);
	}
	// Made a method for printing out the count of 1s
	public static void printAppear(ArrayList<Integer> a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		// This is used when there are no 1s in the list
		if(a.size()==0) {
			System.out.println("There are no 1s in this list!");
		}
		System.out.println();
	}
	
}
