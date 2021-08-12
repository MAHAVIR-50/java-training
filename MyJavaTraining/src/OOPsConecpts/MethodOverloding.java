package OOPsConecpts;

public class MethodOverloding {

	public static void main(String[] args) {
		System.out.println(sum(100,200));
		System.out.println(sum(10,20,40));
		System.out.println(sum(4,6,5));
		
	//In method overloading function name is same but different arguments	
		

	}
	public static int sum(int Fnumber,int Snumber) {
		
		int sum = Fnumber+Snumber;
		
		return sum;

	}
	public static int sum(int Fnumber,int Snumber,int Tnumber) {
		
		int sum = Fnumber+Snumber + Tnumber;
		
		return sum;

	}

}
