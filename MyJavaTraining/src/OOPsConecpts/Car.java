package OOPsConecpts;

public class Car {
	String make;
	String price;
	String horsePower;
	int seats;
	static int wheels=4;

	public Car(String make, String price, String horsePower, int seats) {
		this.make=make;
		this.price=price;
		this.horsePower=horsePower;
		this.seats=seats;
		
	}

	public static void main(String[] args) {
		
		System.out.println("The wheels of car is : " +wheels);
		Car honda = new Car("Civic","10L","800BHP",5);
		System.out.println(honda.make);
		honda.start();
		honda.accelerate();
		honda.brake();
		
		System.out.println("******************************");
		Car toyota = new Car("Camary","25L","1200BHP",5);
		System.out.println(toyota.make);
		toyota.start();
		toyota.accelerate();
		toyota.brake();

	}

	
	public void start() {
		System.out.println("Car is starting with key");

	}

	public void accelerate() {
		System.out.println("Car is accelerating");

	}

	public void brake() {
		System.out.println("Car is braking");

	}

}
