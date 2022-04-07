package daily_coding_problem;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Sieve of Eratosthenes is an algorithm used to generate all prime numbers 
		//smaller than N. The method is to take increasingly larger prime numbers, and
		//mark their multiples as composite.

		//For example, to find all primes less than 100, we would first mark [4, 6, 8, ...]
		//(multiples of two), then [6, 9, 12, ...] (multiples of three), and so on. Once we
		//have done this for all primes less than N, the unmarked numbers that remain will
		//be prime.

		//Implement this algorithm.
		
	
		//2 4 6 8 10
		//3 6 9 12 15
		//4 8 12 16 20
		//5 10 15 20 25
		//6 12 18 24 30
		//7 14 21 28 35
		//8 16 24 32 40
		//9 18 27 36 45
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int m = 100;    //length of array
		
		//populate the array
		for(int i=1; i<=m; i++) {
			arr.add(i);
		}
		
		System.out.println(arr);


			
	



	

		
		
		//arr.add(9);arr.add(11);arr.add(8);arr.add(5);arr.add(7);arr.add(11);
		
		
	}

}
