package prog1.uebungsblatt7;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bitte 1. String eingeben");
		String first = sc.next();
		
		System.out.println("Bitte 2. String eingeben");
		String second = sc.next();
		
		int value = first.compareTo(second);
		
		if(value == 0) System.out.println(first + " == " + second);
		
		if(value > 0) System.out.println(first + " > " + second);
		
		if(value < 0) System.out.println(first + " < " + second);
		
		
		
		
	}

}
