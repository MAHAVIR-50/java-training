package JavaBasic;

public class AlphaBatsPattern {

	public static void main(String[] args) {
		
		int alpha = 65; //65 is used for Capital Letters and 97 is used for small letters
		int size = 10;
		
		for(int i =0; i<=size; i++) {
			for(int j=0; j<=i; j++) {
				
				System.out.print((char)(alpha+j) +" ");
			}
			System.out.println();
		}

	}

}
