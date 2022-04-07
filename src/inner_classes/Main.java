package inner_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer_Class out = new Outer_Class();
		Outer_Class.InnerClass in = out.new InnerClass();
		 
		in.display();
		//System.out.println();
	}

}
