package OOPsConecpts;

public class Function {

	public static void main(String[] args) {
		
		//Calling the function
		
		sum(100,300);  //sum is a function-- reusable  code which can be executed with different values
		sum(10,30);
		sum(5,7);
		sum(1000,3000);
	}
	
	public static void sum(int Fnumber, int Snumber) {
		
		int sum = Fnumber + Snumber;
		System.out.println("The sum is : " + sum);
	}

}
