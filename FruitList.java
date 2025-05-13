package arraylist;

import java.util.ArrayList;
import java.util.List;

public class FruitList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		
		System.out.println("Third fruit is "+fruits.get(2));
		
	}
}
