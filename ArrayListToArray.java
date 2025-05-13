package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		
		String [] fruitsArray = new String[fruits.size()];
		
		fruits.toArray(fruitsArray);
		
		System.out.println("Fruits Array is "+ Arrays.toString(fruitsArray));
		
		List<String> fruitslist = Arrays.asList(fruitsArray);

		System.out.println("Fruits List is "+ fruitslist);
		
	}
}
