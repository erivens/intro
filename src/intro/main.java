package intro;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		int x;
		x = 5;
		int num1 = 3;
		double num2 = 5.0;
		double pow = Math.pow(num1,num2);
		boolean b = false;
		char c = 'C';
		String s = "FUCK";
		int mod = x % num1;
		Scanner sc = new Scanner(System.in);
		String input_str = sc.next();
		Scanner sc_int = new Scanner(System.in);
		int input_int = sc.nextInt();
		//
		System.out.println(input_str);
		System.out.println(input_int);
		System.out.println(num1);
		System.out.println(c);
		System.out.println(s);
		System.out.println(x);
		System.out.println(pow);
		System.out.println(x*num1);
		System.out.println(mod);
	}

}
