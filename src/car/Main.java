package car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Honda = new Car();
		Honda.speedUp(10);
		Honda.changeGear(3);
		Honda.display();
		
		int x = Vehicle.add9(5);
		System.out.println(x);
	}

}
