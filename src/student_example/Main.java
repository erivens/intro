package student_example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student eric = new Student("Eric");
		Student erik = new Student("Eric");
		Student sam = new Student("Samantha");
		Student ryan = new Student("RT");
		
		System.out.println(eric == erik); //shows as false because object is compared not value
		System.out.println(eric.equals(eric));  //shows true due to "equals" method created
		System.out.println(eric.compareTo(ryan));  //"compareTo" method: how far "r"yan is from "e"ric in ABC's 
		System.out.println(eric.compareTo(ryan) > 0);  //runs compare method  with > 0 
		System.out.println(eric);  // "toString" method to turn eric to input data "Eric" otherise get memory location only
		
		System.out.println("....Extra Comparisons....");
		System.out.println(eric.compareTo(sam));  
		System.out.println(eric.compareTo(erik));  
		System.out.println(eric == eric); 
		System.out.println(eric.equals(sam)); 
		
		
		

	}

}
