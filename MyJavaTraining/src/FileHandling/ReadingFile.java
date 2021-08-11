package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		

		String userid = null;
		String password = null;
		int linecounter = 0;
		
		File myObj = new File("C:/Users/Mahavir/Downloads/emaildata/fatchdata.txt");
	      Scanner myReader = null;
	     // C:\Users\Mahavir\Downloads\emaildata
		try {
			myReader = new Scanner(myObj);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	      while (myReader.hasNextLine()) {
	    	  linecounter++;
	    	  System.out.println("lineCounter" + linecounter);
	    	  
	        String data = myReader.nextLine();
	        System.out.println(data);
	        userid = data.split("\\|")[0];
	        password = data.split("\\|")[1];
	        
	        if(linecounter==2) {
	        	break;
	        }
	        
	      }
	      myReader.close();
		
		
		System.out.println("Launch Chrome Browser");
		System.out.println("Enter Url");
		System.out.println("Enter Username " + userid + " In to username field");
		System.out.println("Enter Password " + password + " In to password field");
		System.out.println("Click login button");
		
		

	}

}
