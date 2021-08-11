package CollectionsTest;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Harpreat");
		list.add("Singh");
		list.add("Paniapat");
		list.add("234566789");
		
		
		for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		
	}
			
}
