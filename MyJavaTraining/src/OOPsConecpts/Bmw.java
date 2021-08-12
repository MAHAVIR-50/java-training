package OOPsConecpts;

public class Bmw extends Car{
	
	//I am using the inheritance concepts.

	public Bmw(String make, String price, String horsePower, int seats) {
		super(make, price, horsePower, seats);
		
	}

	public static void main(String[] args) {
		
		System.out.println("The car has: "+wheels+ " wheels");
		
		Bmw bmw_X3 = new Bmw("Bmw_X3","35L","2000BHP",5);
		System.out.println("The name of car is: "+bmw_X3.make);
		System.out.println("***************************************");
		bmw_X3.start();
		bmw_X3.collisionProtection();
		bmw_X3.accelerate();
		bmw_X3.brake();
		
	}
	
	//Override the start function in the child class.
	//In method overriding function name and arguments both are same.
	
	public void start() {
		System.out.println("Car is starting with push button");
	}
	public void collisionProtection() {
		System.out.println("Brake when collision is about to happen");
	}

}
