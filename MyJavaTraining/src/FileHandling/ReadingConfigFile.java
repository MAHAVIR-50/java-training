package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingConfigFile {

	public static void main(String[] args) {
		
		File myObj = new File("C:/Users/Mahavir/Downloads/emaildata/configfile.txt");
	      Scanner myReader = null;
	     // C:\Users\Mahavir\Downloads\emaildata
		try {
			myReader = new Scanner(myObj);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      
	        }
	        
	      
	      myReader.close();
	

	}

}
