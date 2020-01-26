package prog1.uebungsblatt3;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anzahl der Zahlen");
		int n = sc.nextInt();
		
		int minimum = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Bitte Zahl eingeben:");
			
			int zahl = sc.nextInt();
			
			if(i == 0) minimum = zahl;
			
			if(zahl < minimum) {
				minimum = zahl;
			}
		}
		System.out.println("Minimum: " + minimum);
	}

}
