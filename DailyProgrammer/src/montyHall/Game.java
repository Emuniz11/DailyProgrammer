package montyHall;

/**
 * Emuniz11
 * 9/30/2021
 * Daily Programmer Challenge #389 The Monty Hall Problem
 * 
 * For the purpose of today's challenge, the Monty Hall scenario goes like this:
   1. There are three closed doors, labeled #1, #2, and #3. Monty Hall randomly selects one of the three doors and puts a prize behind it. The other two doors hide nothing.
   2. A contestant, who does not know where the prize is, selects one of the three doors. This door is not opened yet.
   3. Monty chooses one of the three doors and opens it. The door that Monty opens (a) does not hide the prize, and (b) is not the door that the contestant selected. There may be one or two such doors. If there are two, Monty randomly selects one or the other.
   4. There are now two closed doors, the one the contestant selected in step 2, and one they didn't select. The contestant decides whether to keep their original choice, or to switch to the other closed door.
   5. The contestant wins if the door they selected in step 4 is the same as the one Monty put a prize behind in step 1.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Game {
	private Door[] doors;
	private Boolean changeMind;
	private int doorChoice;
	private int doorChoice2;
	private int prizeIndex;
	private int r2;
	private int[] data;
	private Scanner sc;
	
	Game () {
		doors = new Door[3];
		doors[0] = new Door(false,false);
		doors[1] = new Door(false,false);
		doors[2] = new Door(false,false);
		changeMind = false;
		doorChoice = 0;
		doorChoice2 = 0;
		prizeIndex = 0;
		r2 = 0;
		data = new int[2];
		sc = new Scanner(System.in);
	}
	
	Game (Boolean c, int dc) {
		doors = new Door[3];
		doors[0] = new Door(false,false);
		doors[1] = new Door(false,false);
		doors[2] = new Door(false,false);
		changeMind = c;
		doorChoice = dc;
		doorChoice2 = 0;
		prizeIndex = 0;
		r2 = 0;
		data = new int[2];
	}
	
	private void randPrize () {
		Random rand = new Random();
		prizeIndex = rand.nextInt(doors.length);
	}
	
	private void openRand () {
		Random rand = new Random();
		r2=prizeIndex;
		while (r2==prizeIndex || r2==doorChoice) {
			r2 = rand.nextInt(doors.length);
		}
		doors[r2].open();
	}
	
	private void setDoorChoice2 () {
		for (int i=0;i<doors.length;i++) {
			if (doors[i].checkStatus()==false && i!=doorChoice) {
				doorChoice2 = i;
			}
		}
	}
	
	int[] getData () {
		return data;
	}
	
	void scClose () {
		sc.close();
	}
	
	void gameStart () {
		randPrize();
		doors[prizeIndex].placePrize();
		
//		System.out.println("doorChoice: " + doorChoice);
//		System.out.println("prizeIndex: " + prizeIndex);
		
		openRand();
		
		if (changeMind==false) {
			if (doorChoice==prizeIndex) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
		} else {
			System.out.println("You changed your choice...");
			setDoorChoice2();
			if (doorChoice2==prizeIndex) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
		}
		
//		if (changeMind==false) {
//			System.out.println("doorChoice: " + doorChoice);
//		} else {
//			System.out.println("doorChoice2: " + doorChoice2);
//		}
		
		if (changeMind==false) {
			data[0] = 0;
			if (doorChoice==prizeIndex) {
				data[1] = 1;
			} else {
				data[1] = 0;
			}
		} else {
			data[0] = 1;
			if (doorChoice2==prizeIndex) {
				data[1] = 1;
			} else {
				data[1] = 0;
			}
		}
		System.out.println("------ENDGAME-----");
	}
	
	void gameStartv2 () throws MHException {

		do {
			System.out.println("Please choose a door... 1/2/3");
			try {
				doorChoice = sc.nextInt();
				if (doorChoice>3 || doorChoice<1) {
					throw new MHException("Door choice invalid");
				}
				break;
			}
			catch (MHException e){
				//System.out.println(e);
				System.out.println("Door choice invalid");
			}
			catch (InputMismatchException e) {
				System.out.println("Your choice is not a number...");
			}
			sc.nextLine();
		} while (true);
		
		doorChoice--;
		
		randPrize();
		doors[prizeIndex].placePrize();
		
//		System.out.println("doorChoice: " + doorChoice);
//		System.out.println("prizeIndex: " + prizeIndex);
		
		openRand();
		
		System.out.println("Ok I have opened door " + (r2+=1));
		
		do {
			System.out.println("Would you like to change your door choice? True/False");
			try {
				changeMind = sc.nextBoolean();
				if (changeMind==null) {
				throw new MHException("Anwser is invalid");
				}
				break;
			}
			catch (MHException e){
				//System.out.println(e);
				System.out.println("Anwser is invalid");
			}
			catch (InputMismatchException e) {
				System.out.println("Your choice is not true or false...");
			}
			sc.nextLine();
		} while (true);
		
		if (changeMind==false) {
			if (doorChoice==prizeIndex) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
		} else {
			System.out.println("You changed your choice...");
			setDoorChoice2();
			if (doorChoice2==prizeIndex) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}
		}
			
//		if (changeMind==false) {
//			System.out.println("doorChoice: " + doorChoice);
//		} else {
//			System.out.println("doorChoice2: " + doorChoice2);
//		}
//		System.out.println("prizeIndex: " + prizeIndex);
		
		if (changeMind==false) {
			data[0] = 0;
			if (doorChoice==prizeIndex) {
				data[1] = 1;
			} else {
				data[1] = 0;
			}
		} else {
			data[0] = 1;
			if (doorChoice2==prizeIndex) {
				data[1] = 1;
			} else {
				data[1] = 0;
			}
		}
		System.out.println("------ENDGAME-----");
	}
	
}
