package JavaBasic;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		
		printNum(1);
	}
	
	public static void printNum(int num) {
		
		if(num<=10) {
			System.out.print(" ");
			System.out.print(num);
			num++;
			printNum(num);
		}
	}

}
