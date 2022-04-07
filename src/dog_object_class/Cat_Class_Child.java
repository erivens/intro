package dog_object_class;

public class Cat_Class_Child extends Dog_Class_Parent {

	protected static int count = 0;
	protected int weight;
	
	
	public Cat_Class_Child(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
		Cat_Class_Child.count += 1;
	}
	public Cat_Class_Child(String name) {
		super(name, 0);
		Cat_Class_Child.count += 1;
	}
	public Cat_Class_Child(String name, int age) {
		super(name, age);
		Cat_Class_Child.count += 1;
	}
	public void speak() {
		System.out.println("I am "+this.name+" I am " +this.age+" years old. I weigh "+this.weight+"lbs.");
	}

}
