package CollectionsTest;

public class ExceptionTest {

	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("Hello Sunny");
		
		
		try {
			System.out.println(100/i);
			
		}
		catch 
		(Exception e){
			System.out.println("Catch the exception here :  " + e.getMessage());
		}
				
		
		System.out.println("End of Program");

	}

}
