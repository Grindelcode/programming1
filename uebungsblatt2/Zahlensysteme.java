package prog1.uebungsblatt2;

import java.util.Scanner;

public class Zahlensysteme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben sie eine Zahl Dezimal ein");
		int zahl = sc.nextInt();
		
		System.out.println("Hex: " + Integer.toHexString(zahl));
		System.out.println("Binär: " + Integer.toBinaryString(zahl));
		
		System.out.println("Bitte geben sie eine Zahl Hexadezimal ein");
		
		String strnumber = sc.next();
		zahl = Integer.parseInt(strnumber, 16);
		
		System.out.println("Dezimal: " + zahl );
		System.out.println("Binär: " + Integer.toBinaryString(zahl));
		
		System.out.println("Bitte geben Sie eine Zahl Binär ein");
		
		strnumber = sc.next();
		zahl = Integer.parseInt(strnumber, 2);
		
		System.out.println("Dezimal: " + zahl );
		System.out.println("Hex: " + Integer.toHexString(zahl));
		
		System.out.println("Bitte geben Sie eine Zahl Octal ein");
		
		strnumber = sc.next();
		zahl = Integer.parseInt(strnumber, 8);
		
		System.out.println("Dezimal: " + zahl);
		System.out.println("Hex: " + Integer.toHexString(zahl));
		
		
		
		
		

	}

}
