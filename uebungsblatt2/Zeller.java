package prog1.uebungsblatt2;

import java.util.Scanner;

public class Zeller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tag eingeben:");
		int d = sc.nextInt();
		
		System.out.println("Monat eingeben:");
		int m = sc.nextInt();
		
		System.out.println("Jahr eingeben eingeben:");		
		int year = sc.nextInt();
		
		int y = year % 100;
		int c = year/100;
		
		int w = (d + (26*(m+1)/10) + (5 * y/4) + (c/4) + 5 * c-1) % 7;
		System.out.println(w);
	}

}
