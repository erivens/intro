package daily_coding_problem;
import java.util.Arrays;

public class Distinct_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Driver code
		
		//Given an array of elements, return the length of the longest subarray where all its elements are distinct.
		//For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest subarray of 
		//distinct elements is [5, 2, 3, 4, 1].
		
		System.out.println("This is the array");
	
	    int arr[] = { 5, 1, 3, 5, 2, 3, 4, 1 };
	    int len = arr.length;
	    
		System.out.println(Arrays.toString(arr));
	    System.out.println("The brute force compare method:");
	    System.out.println("The number of distinct characters: "+countDistinct(arr, len));
	    System.out.println(" ");
	    
	    System.out.println("The sort method:");
		System.out.println("The sorted array:");
	    System.out.println("The number of distinct characters: "+countDis(arr, len));
	    
	}
		//  The brute force compare method
		static int countDistinct(int arr[], int len)
		{
		    int res = 1;
		 
		    // Pick all elements one by one
		    for (int i = 1; i < len; i++)
		    {
		        int j = 0;
		        for (j = 0; j < i; j++)
		            if (arr[i] == arr[j])
		                break;
		 
		        // If not printed earlier,
		        // then print it
		        if (i == j)
		            res++;
		    }
		    return res;
		    
		}
		    
		 
		
		//  The sort method
		static int countDis(int arr[], int len)
		{
		    // First sort the array so that all occurrences become consecutive
		    Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		 
		    // Traverse the sorted array
		    int res = 0;
		    for (int i = 0; i < len; i++)
		    {
		 
		            // Move the index ahead while
		            // there are duplicates
		            while (i < len - 1 &&
		                    arr[i] == arr[i + 1])
		            {
		                i++;
		            }
		            res++;
		    }
		    return res;  
		    
		}
		 
	}


