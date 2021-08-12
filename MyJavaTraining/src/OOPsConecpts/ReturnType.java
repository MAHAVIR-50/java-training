package OOPsConecpts;

public class ReturnType {

	public static void main(String[] args) {
		
		System.out.println(sum(100,200,400));
		System.out.println(sum(10,20,40));
		System.out.println(sum(4,6,5));
		
		System.out.println("******************");
		System.out.println(sum(20.22,50.11));
		System.out.println(sum(221.22,552.11));

	}
	public static int sum(int Fnumber,int Snumber,int Tnumber) {
		
		int sum = Fnumber+Snumber + Tnumber;
		
		return sum;
	}
	
	public static double sum(double Fnumber,double Snumber) {
		
		double sum = Fnumber+Snumber;
		
		return sum;
	}

}
