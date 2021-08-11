package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Launch Chrome Browser");
		System.out.println("Enter Nike URL");
		System.out.println("Add product to order");
		System.out.println("Pay for the order");
		System.out.println("Capture order id and order amount in the file");
		
		//String str = "Hello";
	    BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Mahavir/Downloads/emaildata/fatchdatawrite.txt",true));
	    writer.write( "\n" );
	    writer.write("122345667787|$2000");
	    
	    writer.close();

	}

}
