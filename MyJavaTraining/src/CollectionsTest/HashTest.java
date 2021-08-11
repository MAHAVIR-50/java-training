package CollectionsTest;

import java.util.HashMap;

public class HashTest {

	public static void main(String[] args) {
		HashMap<String,String> list = new HashMap<String,String>();
		
		list.put("India", "Delhi");
		list.put("USA", "WDC");
		list.put("ShriLanka", "Colombo");
		
		
		System.out.println("The Capital of India is  " +list.get("India"));
		System.out.println("The capital of USA is " +list.get("USA"));
		System.out.println("The capital of ShriLanka is " +list.get("ShriLanka"));
		
	}

}
