package NewJavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		String x[][] = new String[3][4];
		System.out.println(x.length);
		System.out.println(x[0].length);
	//  First row	
		x[0][0] ="Abhi";
		x[0][1] ="Bhuvi";
		x[0][2] ="Chetan";
		x[0][3] ="Dharm";
	// Second row	
		x[1][0] ="Ani";
		x[1][1] ="Bani";
		x[1][2] ="Churu";
		x[1][3] ="Dev";
	//  Third row	
		x[2][0] ="Amit";
		x[2][1] ="Bhanu";
		x[2][2] ="Chiku";
		x[2][3] ="Dhanu";
		
		System.out.println("***************");
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				
				System.out.println(x[row][col]);
				
				
			}
		}

	}

}
