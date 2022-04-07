package intro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash Map example - Character counting
		Map m = new HashMap();
		String str = "I want to conquer the world. Give all the idiots a brand new religion";
		System.out.println(str);
		System.out.println(str.toCharArray());
		
		for(char x:str.toCharArray()) {
			if (m.containsKey(x)) {
				int old = (int)m.get(x);
				m.put(x,old+1);
			}
			else {
				m.put(x,1);
			}
		}
		
		m.remove(' ');  //removes the spaces from the hash map
		System.out.println(m);
		
		
		//Array Sorting Example
		int[] x = {8,3,5,2,8,5,8,0,9,3,1,8,5};
		for(int i:x) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		Arrays.sort(x);
		for(int i:x) {
			System.out.print(i + ",");
		}
		//Partial sort
		System.out.println();
		int[] y = {8,3,5,9,8,5,8,0,2,7,1,8,5};
		for(int i:y) {
			System.out.print(i + ",");
		}
		System.out.println();
		Arrays.sort(y,3,8);
		for(int i:y) {
			System.out.print(i + ",");
		}
		
	}

}
