package intro;

public class WorkingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = "Happy ";
		String str2 = "Birthday";
		String str3 = str1 + str2;
		int str3len = str3.length();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str3 + "is "+ str3len+" characters long.");
		System.out.println(str3.charAt(3) + " is the character at position 4.");
		
	}

}
