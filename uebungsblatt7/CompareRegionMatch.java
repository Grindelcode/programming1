package prog1.uebungsblatt7;

import java.util.Scanner;

public class CompareRegionMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte erstes Wort eingeben:");
		String first = sc.next();		
		System.out.println("Bitte zweites Wort eingeben:");
		String second = sc.next();
		
		System.out.println("Anzahl Character");
		int number = sc.nextInt();
		
		System.out.println("Startindex");
		int index = sc.nextInt();
		
		if(first.regionMatches(true, index, second, 0, number)) {
			System.out.println("Strings sind äquivalent");
		}else {
			System.out.println("Strings sind NICHT äquivalent");
		}
		

	}

}
