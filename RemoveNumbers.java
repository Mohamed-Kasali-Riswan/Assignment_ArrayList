package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers1 = Arrays.asList(10,20,30,40,50); // UnsupportedOperationException
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
		
		System.out.println(numbers);
		
		Iterator<Integer> iterator = numbers.iterator();
		
		while(iterator.hasNext()) {
			
			int value = iterator.next();
            if (value > 30) {
                iterator.remove();
            }
			
		}
		
		System.out.println(numbers);
		
	}
}
