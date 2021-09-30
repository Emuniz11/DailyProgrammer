package montyHall;

/**
 * Emuniz11
 * 9/30/2021
 * Daily Programmer Challenge #389 The Monty Hall Problem
 */

public class MHTest {

	public static void main(String[] args) {
		MHData d0 = new MHData();
		MHData d1 = new MHData();
		MHData d3 = new MHData();
		int roundsD0 = 20;
		int roundsD3 = 1;

// 		-----Predefined players-----		
		//Player who did change their choice after one door was opened 
		for (int i=0;i<roundsD0;i++) {
			Game g0 = new Game(true,1);
			g0.gameStart();
			d0.addOutcome(g0.getData());
		}		
		
		//Player who did not change their choice after one door was opened
		for (int i=0;i<roundsD0;i++) {
			Game g1 = new Game(false,1);
			g1.gameStart();
			d1.addOutcome(g1.getData());
		}		
		
		System.out.println();
		
		System.out.println("Data for contestant 1 who changed their choice:");
		d0.findRatio();
		
		System.out.println();
		
		System.out.println("Data for contestant 2 who did not change their choice:");
		d1.findRatio();
		
		System.out.println();
		
		
//		-----User defined player----- 
		//uses gameStartv2		
		for (int i=0;i<roundsD3;i++) {
			Game g0 = new Game();
			g0.gameStartv2();
			d3.addOutcome(g0.getData());
			if (i==roundsD3-1) {
				g0.scClose();
			}
		}
		
		System.out.println();
		
		d3.findRatio();
		
	}

}
