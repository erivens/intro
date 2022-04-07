package temp;

public class Temp{



    public static void main(String[] args){
    	double d = 24.5*2/7;
    	double d1 = 20;
    	int y = (int)(24/3.0);
    	System.out.println(d);
    	
    	String s1 = 'a' + "b";
    	System.out.println(s1);
    	String s2 = "a" + 24;
    	System.out.println(s2);
    	String s3 = new String("STRING");
    	System.out.println(s3);
    	String s4 = "abc" + 'x' + "def";
    	System.out.println(s4);
    	//String s5 = (String)'a';    // error
    	
    	String a = "ABC".concat("DEF");
    	//String b = 'ABC' + 'DEF'   //error
    	
    
    	
    	boolean b = (true && false || (53<24));
    	System.out.println(b);
    	

    	 int option=1;
    	 switch(option){
    	 case 1:
    	  System.out.println("Selected option is 1!");
    	 case 2:
    	  System.out.println("Selected option is 2!");
    	 case 3:
    	  System.out.println("Selected option is 3!");
    	 default:
    	  System.out.println("Invalid option!");
    	 }
    	
    	 
    	 String str = "Joe Woe";
    	 String i1 = ""+str.charAt(0)+str.split(" ")[0].charAt(0);
    	 String i2 = ""+str.charAt(0)+str.split(" ")[1].charAt(0);  // ["Joe", "Woe"]  index 0/ index 0 of second array
    	 String i3 = ""+str.charAt(0)+str.split(" ")[1].charAt(1);
    	 //String i4 = ""+str.charAt(1)+str.split(" ")[2].charAt(1);
    	 System.out.println(i3);
    	 
    } 
    
   }