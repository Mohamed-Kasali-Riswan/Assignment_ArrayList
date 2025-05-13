package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			
			list.add((int) (Math.random()*99));
			
		}
		
		System.out.println("Random list is "+list);
		
		for(int i=0;i<list.size();i++) {
			
			for(int j=0;j<list.size()-1;j++) {
			
				if(list.get(j)>list.get(j+1)) {
					
					int temp = list.get(j);
					
					list.set(j,list.get(j+1));
					
					list.set(j+1, temp);
					
				}
				
			}
		
		}
		
		System.out.println("Sorted list is "+list);
	}

}
