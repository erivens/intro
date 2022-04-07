package car;

public class Car implements Vehicle {
	
	private int gear = 1; 	
	private int speed = 0;
	
	public void changeGear(int gear) {	
		this.gear = gear;
	}
	public void speedUp(int change) {
		this.speed += change;
	}
	public void slowDown(int change) {	
		this.speed -= change;
	}
	public void display(){
		System.out.println("The Honda is traveling "+speed+" mph and is in gear "+gear+".");
		out();  //returns out created in vehicle interface
	}
}
