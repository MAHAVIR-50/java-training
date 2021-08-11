package usingFuntion;

public class Cars {
	
	String make;
	String price;
	String horsepower;
	int seats;
	static int wheels = 4;
	
	//create constructor
	public Cars(String make, String price, String horsepower, int seats) {
		
		this.make  = make;
		this.price = price;
		this.horsepower = horsepower;
		this.seats = seats;
	}
		public static void main(String[] args) {
			
			
			
		}
	
	
	public void start() {
		System.out.println("Car is start with key");
	}
	public void accelerate() {
		System.out.println("Car is accelerate");
	}
	public void  brake() {
		System.out.println("Car is braking");
	}

}
