package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Character> characters = new ArrayList<>();
		
		characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');
        characters.add('H');
        characters.add('I');
        characters.add('J');
        
        System.out.print("Enter the character:");
        char c = sc.next().charAt(0);
        
        System.out.println("Index of "+c+" is "+ getIndex(characters,c));
		
	}
	
	private static int getIndex(List<Character> chars , char c) {
		
		return chars.indexOf(c);
		
	}
}
