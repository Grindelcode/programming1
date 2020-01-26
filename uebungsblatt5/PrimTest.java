package prog1.uebungsblatt5;

import java.util.Scanner;

public class PrimTest {
	
	public static boolean isPrime(int n) {
		for (int t=2; t < n; t++) {
			if (n%t == 0) {
				return false;
			}		
			
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bitte Obergrenze eingeben");
		int max = sc.nextInt();
		
		for(int n = 2; n < max; n++) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}

	}

}
