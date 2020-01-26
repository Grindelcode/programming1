package prog1.uebungsblatt2;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte n eingeben:");

		int n = sc.nextInt();
		
		long result = 1;
		
		for(int i = 2; i <= n;i++) {
			result *= i;
		}
		
		System.out.println("" + n + "! = " + result);
	}

}
