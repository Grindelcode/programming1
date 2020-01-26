package prog1.uebungsblatt3;

import java.util.Scanner;

public class PascalToJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if(x != 0) {
			
			if(x > 2005) {
				x = Math.sqrt(x);
			} else {
				x = x*(x+x);
			}
			
			x = x*x;
		
		}
		
		System.out.println(x);
		
	}
}