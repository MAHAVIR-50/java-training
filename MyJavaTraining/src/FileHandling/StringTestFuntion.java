package FileHandling;

public class StringTestFuntion {

	public static void main(String[] args) {
		String str = "Harpreat";
		
		String str1 = "The rains has started here";
		String str2 = "The|rains|has|started|here";
		
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		
		System.out.println(str1.indexOf('s'));
		
		System.out.println(str1.indexOf("has"));
		System.out.println(str1.equals(str2));
		
		System.out.println(str + " " + str1);
		System.out.println(str.concat(" How are you"));
		
		String name = "Harpreat Singh India";
		
		System.out.println("First Name " + name.split(" ")[0]);
		System.out.println("Second Name " + name.split(" ")[1]);
		System.out.println("Surname " + name.split(" ")[2]);
		
		String name1 = "Harpreat Singh|9898998998|123 Main Street Ambala";
		
		System.out.println("Name " + name1.split("\\|")[0]);
		System.out.println("Phone " + name1.split("\\|")[1]);
		System.out.println("Address " + name1.split("\\|")[2]);
		
		String test[] = str2.split("\\|");
		
		
		for(int i=0;i<test.length; i++) {
			System.out.println(test[i]);
		}  
		
		
	}

}
