package prog1.uebungsblatt1;

import java.util.Scanner;


public class MultScanner {
	
	public static void main(String[] args) {
		
		int n;
		int result = 1;
		int counter = 3;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben");
		n = sc.nextInt();
		
		sc.close();
		
		while(counter <= n) {
			result = result * counter;
			counter = counter + 1;
		}
		
		System.out.println(result);
		
		
	}
}
