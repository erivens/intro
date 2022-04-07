package daily_coding_problem;
import java.util.Arrays;
import java.lang.Math;
import java.util.ArrayList;

import java.util.ArrayList;

public class Fixed_Point_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A fixed point in an array is an element whose value is equal to its index. 
		//Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return False.
		//For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
		
		System.out.println("This is an array");
		int[] sqrArr = new int[4];
		sqrArr[0] = -6;
		sqrArr[1] = 0;
		sqrArr[2] = 2;
		sqrArr[3] = 8;
		boolean matches = false;

		System.out.println("sqrArr[3]="+sqrArr[3]);
		System.out.println(Arrays.toString(sqrArr));	
	
		for (int i = 0 ; i < 4 ; i++)
		{
			if(sqrArr[i] == i)
			{
				System.out.println("Index "+i+" is equal to " + i);
				matches = true;
			}
		}	
		if(matches == false)
		{
			System.out.println("False");
		}
	}
	
}
