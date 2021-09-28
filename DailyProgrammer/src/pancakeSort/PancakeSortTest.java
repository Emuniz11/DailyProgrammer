package pancakeSort;

public class PancakeSortTest {

	public static void main(String[] args) {
		int[] nums = {3,1,2,1};
		int[] nums2 = {0,0,3,0,2,1,5,0,6};
		
		System.out.print("This is the original array: ");
		PancakeSort.print(nums);
		
		PancakeSort.pSort(nums);
	
		System.out.print("This is the new array: ");
		PancakeSort.print(nums);
		
		System.out.print("This is the original array two: ");
		PancakeSort.print(nums2);
		
		PancakeSort.pSort(nums2);
		
		System.out.print("This is the new array: ");
		PancakeSort.print(nums2);

	}

}
