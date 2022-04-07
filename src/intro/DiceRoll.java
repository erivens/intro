package intro;

import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("This program will roll two dice");
		System.out.println("Enter the number of times to roll two dice");
		Scanner sc1 = new Scanner(System.in);
		int numRolls = sc1.nextInt();
		System.out.println("Please enter a number between 1-12");
		Scanner sc2 = new Scanner(System.in);
		int numDie = sc2.nextInt();
		
	
		
		//int numRolls = 35;
		int rolled = 0;
		
		for (int rollNum = 0; rollNum<numRolls;rollNum++) {
			double roll = 6*Math.random()+6*Math.random()+2;
			System.out.println("Roll # " + rollNum + " = " + (int)roll);
			if ((int)roll == 7) {
				rolled = rolled + 1;
			}	
		}
		System.out.println("The number of times " + numDie + " was rolled out of "+numRolls+" rolls: "+rolled);
		
	}

}

