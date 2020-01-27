package prog1.uebungsblatt7;

import java.util.Scanner;

public class CharCounter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Bitte Text eingeben");
		String s = sc.nextLine();
		
		System.out.println("Bitte Buchstaben eingeben");
		char key = sc.next().charAt(0);
		
		int count = 0;
		
		int current = 0;
		
		int last = -2;
		
		for(int i=-1; i < s.length();) {
			
			current = s.indexOf(key, ++i);
			
			if(current != -1 && current != last) {
				
				last = current;
				
				count++;
			}
			
		}
		
		System.out.println("Number of " + key + ": " + count);
		
	}

}
