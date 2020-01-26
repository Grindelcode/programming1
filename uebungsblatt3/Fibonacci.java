package prog1.uebungsblatt3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		long n1=0;
		long n2=1;
		long n3=0;
		
		System.out.println("Bitte n eingeben:");
		int n = sc.nextInt();
		
		for(int i=2; i <=n; i++) {
			
			n3 = n1+n2;
			
			n1 = n2;
			n2 = n3;
		}
				
		if(n == 0) {
			System.out.println("f0 = 0");
		}else if(n == 1) {
			System.out.println("f1 = 1");
		}else {
			System.out.println("f" + n + " = " + n3);
		}
				
		
	}

}
