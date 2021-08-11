package NewJavaBasics;

public class OperatorTypes {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 30;
		
		
		if(a>b) {
			System.out.println("a is greater number");
			
		}else 
			System.out.println("b is greater number");
		
		int c = 40;
		int d = 50;
		
		if(c==d) {
			System.out.println("c and d are equal");
			
		}else 
			System.out.println("c and d are not equal");
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		if(a1>b1 & a1>c1) {
			
			System.out.println("a is greatest");
		}else if(b1>c1) {
			System.out.println("b1 is greatest");
			
		}else
			System.out.println("c1 is greatest");
			
	}
	

}
