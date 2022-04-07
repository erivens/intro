package daily_coding_problem;
import java.util.Arrays; import java.util.ArrayList;

public class Boustrophedon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Good morning! Here's your coding interview problem for today.
		//This problem was asked by Morgan Stanley.
		//In Ancient Greece, it was common to write text with the first line going left
		//to right, the second line going right to left, and continuing to go back and forth. 
		//This style was called "boustrophedon".
		//Given a binary tree, write an algorithm to print the nodes in boustrophedon order.

		//For example, given the following tree:

		//		       1
		//		    /     \
		//		  2         3
		//		 / \       / \
		//		4   5     6   7
		//		You should return [1, 3, 2, 4, 5, 6, 7]

		
	    int arR[] = {1, 2, 3, 4, 5, 6, 7};
	    int len = arR.length;
	    System.out.println(arR);
	    System.out.println(Arrays.toString(arR));
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int m = 7;    //length of array
		
		//populate the array
		for(int i=1; i<=m; i++) {
			arr.add(i);
		}
		
		System.out.println(arr);
		
		
		
		
		
		
		
	}

}
