package prog1.uebungsblatt7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LastChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte text eingeben:");
		
		String s = sc.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		
		while(tokenizer.hasMoreTokens()) {
			String current = tokenizer.nextToken();
			
			if(current.endsWith("er")) {
				System.out.println(current);
			}
		}
		
		

	}

}
