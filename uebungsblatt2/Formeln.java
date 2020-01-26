package prog1.uebungsblatt2;

import java.util.Scanner;

public class Formeln {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte x eingeben:");
		double x = sc.nextDouble();
		
		System.out.println("Bitte y eingeben:");
		double y = sc.nextDouble();
		
		double z = x*x*y*y - 4*x*y+4;
		System.out.println("1) " + z);
		
		double u = (1+x*y)*(1+x*y);
		z = u/(1+(u*u));
		System.out.println("2) " + z);
		
		z = x*y + (3-x)*y-y;
		System.out.println("3) " + z);
		
		z = 2*y;
		System.out.println("4) " + z);

		
		
		
	}
}
