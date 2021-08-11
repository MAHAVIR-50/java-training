package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("C:/Users/Mahavir/Downloads/emaildata/configfile.txt");
			prop = new Properties();
			prop.load(fis);
			//prop.getProperty("URL");
	/*		System.out.println(prop.getProperty("URL"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));   */
			
			System.out.println("Launch Browser");
			System.out.println("Enter URL :" + prop.getProperty("URL"));
			System.out.println("Enter Username : " + prop.getProperty("username"));
			System.out.println("Enter Password : " + prop.getProperty("password"));
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
	//	return prop;

	}

}
