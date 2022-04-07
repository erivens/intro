package intro;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		multave(4,6);  //running the method
		golden(6);
	
	
	
	}
	
	public static void multave(int x, int y) {
		//multave is the METHOD to find the product and average of two numbers
		double ave = (x+y)/2;
		System.out.println("The solution to "+x+"*"+y+"="+x*y);	
		System.out.println("The average of "+x+" and "+y+" is "+ ave);
	}
	public static void golden(int i) {
		int sum = 0;
		for (int i1 = 0; i1 < i; i1++) {
			sum = sum + (i1+1);
			System.out.println("The golden ratio for " + i1 + " is " + sum);
		}
	}

}
