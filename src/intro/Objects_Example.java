package intro;

public class Objects_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		name();
		name();
		in("eric");      //"eric" is an argument being passed to in
		//mul("Bob",4);
		//System.out.println(add_2(6));
		//System.out.println(str("Hi"));
	
	////////////////////////////////////////
	}
	private static void name() {
		System.out.println("Name();");
		System.out.println("ERIC!");	
	}	
	private static void in(String str) {
		System.out.println("in();");
		System.out.println(str);	
	}
	private static void mul(String str, int x) {
		System.out.println("mul();");
		for (int i = 1; i <= x; i++) {
		System.out.println(str);
		System.out.println(str + i);
		}
	}
	private static int add_2(int x) {
		return x+2;	
	}
	private static String str(String x) {
		return x + "!  How are you friend?";
	}
}




