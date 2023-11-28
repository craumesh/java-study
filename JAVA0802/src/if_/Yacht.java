package if_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Play{
	public final int DICECOUNTMAX = 5;
	public final int DICENUMMAX = 6;
	int arrayResistList[] = new int[13];
	boolean arrayResistCheck[] = new boolean[13];
	int arrayDice[] = new int[DICECOUNTMAX];
	boolean keepDice[] = new boolean[DICECOUNTMAX];
	int numRound = 0;
	int numReroll = 0;
	int straightCnt = 0;
	Scanner sc = new Scanner(System.in);
	
	void startGame() {
		if(numRound < 13) {
			for(int i = 0; i < DICECOUNTMAX; i++) {
				arrayDice[i] = (int)(Math.random() * DICENUMMAX) + 1;
				keepDice[i] = false;
				straightCnt = 0;
			}			
			numReroll = 3;
			numRound += 1;
			menuSelector();
		}else {
			showPoint(false);
			System.out.print("게임 종료!\n");
			sumPoint();
		}
	}
	
	void sumPoint() {
		int sum = 0;
		for(int i = 0; i < arrayResistList.length; i++) {
			sum += arrayResistList[i];
		}
		System.out.print(" [ " + sum + " ]점 입니다!\n");
	}
	
	void showResist(int i) {
			System.out.println( arrayResistCheck[i] ? " *" : "") ;
	}
	
	void showPoint(boolean bMode) {
		System.out.println("\n[ Y A C H T  *  G A M E ]\n");
		if(bMode) {
			for(int i = 0; i < arrayResistList.length; i++) {
				switch(i) {
				case 0: 
				case 1: 
				case 2: 
				case 3: 
				case 4: 
				case 5: System.out.print("[" + i + "] " + " Just " + (i + 1) + " : (" + arrayResistList[i] + ")"); break;
				case 6: System.out.print("[" + i + "] " + " Triple : (" + arrayResistList[i] + ")"); break;
				case 7: System.out.print("[" + i + "] " + " Four   : (" + arrayResistList[i] + ")"); break;
				case 8: System.out.print("[" + i + "] " + " FHouse : (" + arrayResistList[i] + ")"); break;
				case 9: System.out.print("[" + i + "] " + " 4-St   : (" + arrayResistList[i] + ")"); break;
				case 10: System.out.print("[" + i + "] " + "5-St   : (" + arrayResistList[i] + ")"); break;
				case 11: System.out.print("[" + i + "] " + "Chance : (" + arrayResistList[i] + ")"); break;
				case 12: System.out.print("[" + i + "] " + "Yacht  : (" + arrayResistList[i] + ")"); break;
				}
				showResist(i);
			}
		} else {
			for(int i = 0; i < arrayResistList.length; i++) {
				switch(i) {
				case 0: 
				case 1: 
				case 2: 
				case 3: 
				case 4: 
				case 5: System.out.print("Just " + (i + 1) + " : (" + arrayResistList[i] + ")"); break;
				case 6: System.out.print("Triple : (" + arrayResistList[i] + ")"); break;
				case 7: System.out.print("Four   : (" + arrayResistList[i] + ")"); break;
				case 8: System.out.print("FHouse : (" + arrayResistList[i] + ")"); break;
				case 9: System.out.print("4-St   : (" + arrayResistList[i] + ")"); break;
				case 10: System.out.print("5-St   : (" + arrayResistList[i] + ")"); break;
				case 11: System.out.print("Chance : (" + arrayResistList[i] + ")"); break;
				case 12: System.out.print("Yacht  : (" + arrayResistList[i] + ")"); break;
				}
				showResist(i);
			}
		}
		System.out.print("\n");
	}
	
	void showTable() {
		showPoint(false);		
		for(int i = 0; i < DICECOUNTMAX+2; i++) {
			if(i < 5) {
				System.out.print("[" + i + "]");
			} else if( i == 5 ) {
				System.out.print(" \u2503" + " [" + i + "]");				
			} else {
				System.out.print("[" + i + "]");	
			}
			
		}
		System.out.print("\n");
		for(int i = 0; i < DICECOUNTMAX+2; i++) {
			if(i < 5) {
				System.out.print(" " + (arrayDice[i]) + " ");
			} else if(i == 5) {
				System.out.print(" \u2503 " + " R ");				
			} else {
				System.out.print(" S ");	
			}
		}
		System.out.print("\n");
		for(int i = 0; i < DICECOUNTMAX; i++) {
			if(keepDice[i] == true) {
				System.out.print("[K]");
			}
			else {
				System.out.print(" " + " " + " ");
			}
		}
		System.out.println("\n");
	}
	
	void menuSelector() {
		showTable();
		int i = sc.nextInt();
		switch(i) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: diceKeeping(i); break;		
		case 5: diceReroll(); break;
		case 6: diceResist(i); break;
		default:
		}
	}
	
	void diceKeeping(int nDiceNum) {
		if(keepDice[nDiceNum] == false) {
			keepDice[nDiceNum] = true;
		}else {
			keepDice[nDiceNum] = false;
		}
		menuSelector();
	}
	
	void diceReroll() {		
		if(numReroll != 0) {
			numReroll--;
			for(int i = 0; i < DICECOUNTMAX; i++) {
				if(keepDice[i] == false)
				{
					arrayDice[i] = (int)(Math.random()*DICENUMMAX) + 1;
				}
			}
		} else {
			System.out.print("리롤 횟수가 모두 소모 되었습니다!\n");
		}
		menuSelector();
	}
	
	boolean diceFrequency(int nFrequency) {
		boolean frequencyCheck = false; 
		Loop1:
		for(int j = 0; j <= DICENUMMAX; j++) {
			int count = 0;
			for(int i = 0; i < DICECOUNTMAX; i++) {
				if(arrayDice[i] == j) {
					++count;	
					if(count >= nFrequency) {
						frequencyCheck = true;
						break Loop1;
					}
				}
			}			
		}
		return frequencyCheck;
	}
	
	boolean checkFullHouse() {
		boolean fhCheck = false;
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < arrayDice.length; i++) {
		    intList.add(arrayDice[i]);
		}		
		System.out.println(intList);
		Loop1:
		for(int i = 0; i <= DICENUMMAX; i++) {
			if(Collections.frequency(intList, i) == 3) {
				for(int j = 0; j < DICENUMMAX; j++) {
					if(Collections.frequency(intList, j) == 2) {
						fhCheck = true;
						break Loop1;
					}
				}
			}else if(Collections.frequency(intList, i) == 2) {
				for(int j = 0; j < DICENUMMAX; j++) {
					if(Collections.frequency(intList, j) == 3) {
						fhCheck = true;
						break Loop1;
					}
				}
			}
		}
		return fhCheck;
	}
	
	void checkStraight() {
		Arrays.sort(arrayDice);	
		for(int i = 0; i < DICECOUNTMAX; i++) {
			System.out.print(arrayDice[i] + " ");
		}
		System.out.print("\n");
		for(int i = 1; i<DICECOUNTMAX; i++) {
			if(arrayDice[i-1] + 1 == arrayDice[i]) {
				straightCnt++;
			}			
		}
	}
	
	void diceResist(int nResistSlot) {
		int diceScore = 0;
		boolean compliteSelect = false;
		showPoint(true);		
		
		while(compliteSelect == false) {
			int j = sc.nextInt();		
			if(arrayResistCheck[j] == false) {
				switch(j) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					for(int i = 0; i < DICECOUNTMAX; i++) {
						if(arrayDice[i] == (j + 1)) {
							diceScore += (j + 1);
						}
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 6:
					if(diceFrequency(3)) {
						for(int i = 0; i < DICECOUNTMAX; i++) {
							diceScore += arrayDice[i];
						}
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 7:
					if(diceFrequency(4)) {
						for(int i = 0; i < DICECOUNTMAX; i++) {
							diceScore += arrayDice[i];
						}
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 8:
					if(checkFullHouse()) {
						diceScore = 25;
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 9:
					checkStraight();
					if(straightCnt >= 3) {
						diceScore = 30;
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 10:
					checkStraight();
					if(straightCnt >= 4){
						diceScore = 40;
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 11:
					for(int i = 0; i < DICECOUNTMAX; i++) {
						diceScore += arrayDice[i];
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				case 12:
					if(diceFrequency(5)) {
						diceScore = 50;
					}
					arrayResistList[j] = diceScore;
					arrayResistCheck[j] = true;
					break;
				}
				compliteSelect = true;
			}
		}
		startGame();		
	}
}

public class Yacht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play Me = new Play();
		Me.startGame();		
	}
}
