package prog1.uebungsblatt7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte text eingeben:");
		
		String s = sc.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(s);
		
		while(tokenizer.hasMoreTokens()) {
			String current = tokenizer.nextToken();
			
			if(current.startsWith("b")) {
				System.out.println(current);
			}
		}

	}

}
