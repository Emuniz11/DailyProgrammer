package nonogramPuzzle;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> binaryArray0 = new ArrayList<Integer>(List.of(
				1,0,1,0,1,1,0,0,0,1,1,0,0));
		ArrayList<Integer> binaryArray1 = new ArrayList<Integer>(List.of(
				0,1,1,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1,1,0,1));
		ArrayList<Integer> binaryArray2 = new ArrayList<Integer>(List.of(
				0,0,0));
		ArrayList<Integer> binaryArray3 = new ArrayList<Integer>(List.of(
				1,1,1,1,1,1,1,1));
		NonogramRow nonogramRow = new NonogramRow();
		
		nonogramRow.countAppear(binaryArray0);
		nonogramRow.countAppear(binaryArray1);
		nonogramRow.countAppear(binaryArray2);
		nonogramRow.countAppear(binaryArray3);
	}
	
}
