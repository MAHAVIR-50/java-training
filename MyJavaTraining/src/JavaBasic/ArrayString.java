package JavaBasic;

public class ArrayString {

	public static void main(String[] args) {
		
		String Fname = "Mahavir";
		String Lname = "Chhoker";
		String Address = "123 main street";
		String City = "Panipat";
		
		System.out.println(Fname + "\n" +Lname +"\n" +Address +"\n" + City);
		
		System.out.println("----------------");
		String address[] = new String[4];
		
		address[0] = "Mahavir";
		address[1] = "Chhoker";
		address[2] = "123 main street";
		address[3] = "Panipat";
		
		for(int i=0; i<address.length; i++) {
			System.out.print(address[i]);
			System.out.println();
		}
		System.out.println("-----------------");
		
		int mobile[] = new int[4];
		mobile[0] =898989899;
		mobile[1] =989898989;
		mobile[2] =787878787;
		mobile[3] =987987987;
		
		for(int i=0; i<mobile.length; i++) {
			System.out.print(mobile[i]);
			System.out.println();
			
		}
		
	}

}
