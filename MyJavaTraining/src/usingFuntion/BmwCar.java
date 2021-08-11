package usingFuntion;

public class BmwCar extends Cars{

	public BmwCar(String make, String price, String horsepower, int seats) {
		super(make, price, horsepower, seats);
		
	}

	public static void main(String[] args) {
		
		Cars Bmw = new BmwCar("X3", "35lakh", "2500BHP", 5);
		System.out.println(Bmw.make);
		
		Bmw.start();
		Bmw.accelerate();
		Bmw.brake();
		
		BmwCar bmw = new BmwCar("X3", "35lakh", "2500BHP", 7);
		bmw.collisionProtection();
		

	}
	//start method is override
	
	public void start() {
		System.out.println("The Car is start with push button");
	}
	
	public void collisionProtection(){
		System.out.println("Brake when collision is happen");
	}

}
