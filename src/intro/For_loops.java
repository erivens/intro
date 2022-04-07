package intro;
import java.util.Scanner;

public class For_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i <=6; i++) {
			System.out.println(i);
		}
		for(int i = 0; i <=6; i+=2) {
			System.out.println(i);
		}
		
		int[] arr = {1,3,5,6,4,3,6,7,4};
		System.out.println("The array length is " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 3) {
				System.out.println("The number 3 is at index " + i);
			}
		}
		int count = 0;
		for (int element:arr) {
			System.out.println(element + " " + count);
			count++;
			}
		String[] names = new String[5]; 
		
		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < names.length; x++) {
			System.out.print("input name for array position " + x + " ");
			String input =sc.nextLine();	
			names[x] = input;
		}
		for (String n:names) {
			System.out.println(n);
			if (n.equals("eric")) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
