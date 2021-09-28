package pancakeSort;


/**
 * Emuniz11
 * 9/28/2021
 * Daily Programmer Challenge #392 Pancake Sort
 * 
 * Warmup: Implement the flipfront function. Given an array of integers and a number n between 2 
 * and the length of the array (inclusive), return the array with the order of the first n elements reversed.
 * 
 * Challenge: Given an array of integers, sort the array (smallest to largest) using the flipfront function 
 * on the entire array. Make sure you correctly handle elements that appear more than once in the array!
 * You may not modify the array by any other means, but you may examine it however you want. You can even 
 * make a copy of the array and manipulate the copy, including sorting it using some other algorithm.
 */

public class PancakeSort {
	
	public static void flipFront (int[] nums, int place) {
		int hold;
		int start = 0;
		
		while (start<place) {
			hold = nums[start];
			nums[start] = nums[place];
			nums[place] = hold;
			start++;
			place--;
		}
	}
	
	public static void pSort (int[] nums) {
		for (int size=nums.length;size>1;size--) {
			int maxI = findMax(nums,size);
			System.out.println("Max Index = " + maxI);
			System.out.println("i = " + size);
			if (maxI!=size-1) {
				flipFront(nums,maxI);
				flipFront(nums,size-1);
			}
		}
	}
	
	static int findMax (int nums[], int n) {
		int max = 0;
		for (int i=0;i<n;i++) {
			if(nums[i] > nums[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void print(int[] numbers) {
		for (int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
	}
	
}
