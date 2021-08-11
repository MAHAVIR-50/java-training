package FileHandling;

public class ConvertDataType {

	public static void main(String[] args) {
		
		String firstnumber = "100";
		String secondnumber = "200";
		
		System.out.println(Integer.valueOf(firstnumber) + Integer.valueOf(secondnumber));
		System.out.println(Integer.parseInt(firstnumber) + Integer.parseInt(secondnumber));
		
		String streetName = "Main Street";
		int streetnumber = 123;
		
		String streetNaam = String.valueOf(streetnumber);
		
		String flag = "";
		
		boolean flag1 = Boolean.valueOf(flag);
		System.out.println(flag1);
	}

}
