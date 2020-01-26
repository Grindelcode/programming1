package prog1.uebungsblatt2;

import java.util.Scanner;

public class Zellererweitert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tag eingeben:");
		int d = sc.nextInt();
		
		System.out.println("Monat eingeben");
		int m = sc.nextInt();
		
		if(m < 3) {
			m+=12;
		}
		
		System.out.println("Jahr eingeben");
		int year = sc.nextInt();
		
		int y = year % 100;
		int c = year/100;
		
		int w = (d + (26*(m+1)/10) + (5 * y/4) + (c/4) + 5 * c-1) % 7;
		
		String s = "";
		
		switch(w) {
		case 0:
			s = "Sonntag";
			break;
		case 1:
			s = "Montag";
			break;
		case 2:
			s = "Dienstag";
			break;
		case 3:
			s = "Mittwoch:";
			break;
		case 4:
			s = "Donnerstag";
			break;
		case 5:
			s = "Freitag";
			break;
		case 6:
			s = "Samstag";
			break;
		default:
			s = "ungültig";
			
			}
		
		System.out.println(s);		
	}
}
