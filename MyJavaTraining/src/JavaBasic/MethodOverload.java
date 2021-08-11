package JavaBasic;

public class MethodOverload {

	public static void main(String[] args) {
		
		sum(100,200);
		sum(25,55);
		sum(125,55,75);

	}
	public static void sum(int Fnumber, int Snumber) {
		int sum = Fnumber + Snumber;
		System.out.println("The total sum of two number is " +sum);
		
		System.out.println("-----------------------");
		
	}
	
	public static void sum(int Fnumber, int Snumber, int Tnumber) {
		
		int sum = Fnumber + Snumber + Tnumber;
		System.out.println("The total sum of three number is " +sum);
	}
}
