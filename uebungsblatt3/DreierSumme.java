package prog1.uebungsblatt3;

import java.util.Scanner;

public class DreierSumme {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte n eingeben");
		
		int n = sc.nextInt();
		
		int summe = 0;
		
	//	for(int i = 3; i <= n; i += 3) {
	//		if(i != 3) System.out.print(" + ");
	//		summe += i;
	//		System.out.print("" + i);
	//	}
		
	//	int j = 3;
		
	//	while(j <= n) {
	//		if(j != 3) System.out.print(" + ");
	//		summe += j;
	//		System.out.print("" + j);
	//		j+=3;
	//	}
		
		int k = 3;
		
		if(n >= 3) {
		do {
			if(k != 3) System.out.print(" + ");
				
				summe += k;
				System.out.print("" + k);
				k+=3;
		
		}while(k <= n);
		}
		
		
		System.out.println("\nSumme: " + summe);

	}

}
