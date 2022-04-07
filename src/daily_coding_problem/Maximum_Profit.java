package daily_coding_problem;
import java.util.Arrays;
import java.util.ArrayList;

public class Maximum_Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a array of numbers representing the stock prices of a company in chronological order,
		//write a function that calculates the maximum profit you could have made from buying and 
		//selling that stock once. You must buy before you can sell it.

		//For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock
		//at 5 dollars and sell it at 10 dollars.
		
		System.out.println("This is the array");
		//int[] arr = new int[6];
		//int arr[] = new int[] {9,11,8,5,7,10};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(9);arr.add(11);arr.add(8);arr.add(5);arr.add(7);arr.add(11);
		
		
		
		System.out.println(arr);
		

		
		
		arr.sort(null);
		System.out.println("This is the sorted array");
		System.out.println(arr);
		int maxP = (arr.get(arr.size()-1) - arr.get(0));
		System.out.println("This is the largest less smallest numbers in the array");
		System.out.println(maxP);

		

	}

}
