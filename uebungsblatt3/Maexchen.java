package prog1.uebungsblatt3;

import java.util.Scanner;

public class Maexchen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte 1. Würfelzahl eingeben: ");
		int a = sc.nextInt();
		
		System.out.println("Bitte 2. Würfelzahl eingeben: ");
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		if(min == 1 && max == 2) {
			System.out.println("1000");
		} else if (min == max) {
			System.out.println(100*min);
		} else {
			System.out.println(10 * max + min);
		}
		
		
		
		
		
		
//		if(a == b) {
//			
//			System.out.println(100*a);
//		}
//		
//		if((a == 1 && b == 1) || (a == 2 & b == 1)) {
//			System.out.println("1000");
//		} else {
//		if (a > b) {
//				System.out.println(10*a+b);
//			} else if (a < b) {
//				System.out.println(10*b+a);
//				
//			}
//		}
		


	}

}
