package intro;
import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number 10: ");
		
		int x = scan.nextInt();
		int count = 0;
		
		//while loop
		while (x != 10) {
			System.out.println("Please type the number 10.");
			System.out.print(x + " does not equal 10. Try again: ");
			x = scan.nextInt();
			count++;
		}
		
		System.out.println("........you entered 10!");
		System.out.println("..incorrect entry entered " + count + " times");
		
		//do while loop
		int y;
		do {
			System.out.print("Please type the number 8. " );
			y = scan.nextInt();
			if (y != 8) {
				System.out.println("Try again: ");
			}
			else {
				System.out.println("Great Job!");
			}
		} while	(y!=8);
		System.out.println("........you entered 8!");	
	}

}
