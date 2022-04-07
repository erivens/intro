package dog_object_class;

public class Dog_Object {

	public static void main(String[] args) {
		//define and call methods on dogs (Dog_Class_Parent.java)
		Dog_Class_Parent barclay = new Dog_Class_Parent("Barclay", 12);   //instance of Dog class (Dog.java)called barclay
		Dog_Class_Parent marshall = new Dog_Class_Parent("Marshall",10);  //instance of Dog class (Dog.java)called marshall
		Dog_Class_Parent.display();
		marshall.speak();  //the dog class is in the Dog.java class file
		barclay.speak();
		//define and call methods on cats (Cat_Class_Child.java)
		Cat_Class_Child whiskey = new Cat_Class_Child("whiskey");
		Cat_Class_Child pc = new Cat_Class_Child("Patches Cat", 18);
		Cat_Class_Child sneakers = new Cat_Class_Child("Sneakers", 17, 10);
		
		whiskey.speak();
		pc.speak();
		sneakers.speak();
		
		//get and change age of a dog
		System.out.println("Now run getAge and change age");
		int x = barclay.getAge();
		System.out.println("The old age is: " +x);
		barclay.setAge(13);
		int y = barclay.getAge();
		System.out.println("The new age is: "+y);
		barclay.speak();	//shows new age 
		
		//count the number of dogs and cats defined in main
		System.out.println("The number of cats and dogs: "+Dog_Class_Parent.count);
		System.out.println("The number of cats: "+Cat_Class_Child.count);
	}

}
