package prog1.uebungsblatt5;

import java.util.Scanner;

public class Triangle {
	
	public static double hypothenuse(double a, double b) {
		double hypotSquared = Math.pow(a, 2) + Math.pow (b, 2);
		
		return Math.sqrt(hypotSquared);
	}

	public static void main(String[] args) {
	
			
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte a eingeben");
		a = sc.nextDouble();
		System.out.println("Bitte b eingeben");
		b = sc.nextDouble();
		
		c = Triangle.hypothenuse(a, b);
		
		System.out.println("Hypothenuse c = " + c);
		
		
	}

}
