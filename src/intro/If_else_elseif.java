package intro;
import java.util.Scanner;

public class If_else_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//             basic text comparison		
		System.out.print("if you type eric, your output will be eric ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		if (st.equals("eric")) {
			System.out.println("ERIC");
		}
		else if (st.equals("ERIC")) {
			System.out.println("eric");
		}
		else {
			System.out.println("you are a dummy");
		}

		//         age conditional
		System.out.print("please enter your age ");
		Scanner sa = new Scanner(System.in);
		String sage = sa.nextLine();
		int age = Integer.parseInt(sage);
		if (age >= 21) {
			System.out.println("You can smoke AND drink");
		}
		else if (age >= 18) {
			System.out.println("You can smoke NOT drink");
			System.out.print("Have you ever drank alcohol? Y/N ");
			String alc = sa.nextLine();
			if (alc.equals("Y")) {
				System.out.println("you are breaking the law");
			}
			else if (alc.equals("N")) {
				System.out.println("you are very wise");
			}
		}
		else if (age <= 0) {
			System.out.println("You haven't been born yet");
		}
		else {
			System.out.println("you are too young to sin");
		}
	
	
	
	
	
	
	
	
	
	
	
	}	

}
