package intro;
import java.util.Scanner;

public class Comp_Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 6, a = 12;
		int y = 7;
		int z = 10;
		boolean compare_int = x == y;   // >, <, ==, !=, <=, >=
		System.out.println("basic compare:" + compare_int);
		boolean compare_and = x < y && x < z ;  //  && implies and, || implies or 
		System.out.println("and statement:" + compare_and);
		boolean compare_or = x > y || x > z ;  //  && implies and, || implies or 
		System.out.println("or statement:" + compare_or);
		boolean compare_opp = !(false);
		System.out.println("the opposite of false is:" + compare_opp);
		
		
		String st1 = "Hello";
		String st2 = "Hello";
		boolean compare_str = st1 == st2;   // ==, !=
		System.out.println("string compare:" + compare_str);
	}

}
