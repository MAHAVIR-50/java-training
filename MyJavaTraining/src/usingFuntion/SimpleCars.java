package usingFuntion;

public class SimpleCars extends Cars{

	public SimpleCars(String make, String price, String horsepower, int seats) {
		super(make, price, horsepower, seats);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("The car has four wheels  "+ Cars.wheels);
		
		Cars City = new SimpleCars("Honda", "10lakhs", "1200BHP", 5);
		System.out.println(City.make);
		
		System.out.println("Car is made by  "+ City.make);
		System.out.println("The price of car is  "+ City.price);
		City.start();
		City.accelerate();
		City.brake();
		
		System.out.println("-----------------");
		
		Cars Camary = new SimpleCars("Toyota", "25lakhs", "2000BHP", 5);
		System.out.println(Camary.make);
		
		System.out.println("Car is made by  "+ Camary.make);
		System.out.println("The price of car is  "+ Camary.price);
		Camary.start();
		Camary.accelerate();
		Camary.brake();
		
	}

}
