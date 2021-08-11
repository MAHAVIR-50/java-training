package NewJavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println(i.length); //It gives size of array/ length of array
		for(int j=0; j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		System.out.println("***********");
		String s[] = new String[4];
		s[0] = "Hello";
		s[1] = "Java";
		s[2] = "World";
		s[3] = "Welcome";
		
		for(int k=0; k<s.length;k++) {
			System.out.println(s[k]);
		}
		System.out.println("****************");
		Object ob[] = new Object[6];
		ob[0] = "Ravi";
		ob[1] = 35;
		ob[2] = 11.22;
		ob[3] = 'M';
		ob[4] = "1/1/1986";
		ob[5] = "London";
		
		for(int l=0; l<ob.length; l++) {
			System.out.println(ob[l]);
		}
	

	}

}
