package dog_object_class;

public class Dog_Class_Parent {
	
	protected static int count = 0; //use static instance: don't care about instance-
	protected String name;			//	only want to store it in the class
	protected int age;
	
	public Dog_Class_Parent(String name, int age) {
		this.name = name;
		this.age = age;
		Dog_Class_Parent.count += 1;
		add2();
	}
	public void speak() {
		System.out.println("My name is "+this.name+" and I am " +this.age+" years old.");
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int add2() {
		return this.age+2;
	}
	public static void display() {
		System.out.println("These are the dogs and cats:");
	}
}
