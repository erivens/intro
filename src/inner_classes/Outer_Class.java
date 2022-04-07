package inner_classes;

public class Outer_Class {
	public class InnerClass{
		public void display(){
			System.out.println("This is an inner class");
		}
	}

	
	public void inner() {
		InnerClass in = new InnerClass();
		in.display();
	}
}
