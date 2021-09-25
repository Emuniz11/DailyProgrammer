package makingChange;

import java.util.ArrayList;
import java.util.Arrays;

public class MakingChangeTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> amount = new ArrayList<Integer>(
				Arrays.asList(0,12,468,123456));
		
		for (int i=0;i<amount.size();i++) {
			MakeChange.makeChange(amount.get(i));
		}

	}

}
