package prog1.uebungsblatt2;

import java.util.Scanner;

public class LogicalExpressions {

	public static void main(String[] args) {
		
		boolean result = false;
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie a ein:");
		a = sc.nextInt();
		
		System.out.println("Bitte geben Sie b ein:");
		b = sc.nextInt();
		
		System.out.println("Bitte geben Sie c ein:");
		c = sc.nextInt();
		
		System.out.println("Bitte geben Sie d ein:");
		d = sc.nextInt();

		if(a > 1 || b > 1 || b > 1 || c > 1 || d > 1) {
			result = true;
		}
			System.out.println("Aussage 1: " + result);
			
			
		if ((a <= 1) && (b <= 1) && (c <= 1) && (d <= 1) || ((a > 1) && (b > 1) && (c > 1) && (d > 1))) {
			result = false;
		} else {
			result = true;
		}
		
			System.out.println("Aussage 2: " + result);
		
		if	(((a < 0) && (b >= 0) && (c >= 0) && (d >=0)) 	||
			((b < 0) && (b >= 0) && (c >= 0) && (d >=0)) 	||
			((c < 0) && (b >= 0) && (c >= 0) && (d >=0)) 	||
			((d < 0) && (b >= 0) && (c >= 0) && (d >=0)))  {
			result = true;
		} else {
			result = false;
		}
		
			System.out.println("Aussage 3: " + result);
			
		if 	(((a > 0 ) && (a <= 10)) ||
			((b > 0 ) && (b <= 10)) ||
			((c > 0 ) && (c <= 10))	||
			((d > 0 ) && (d <= 10)))	{
			result = false;
			} else {
			result = true;
			
		}
		
		System.out.println("Aussage 4: " + result);

	}

}
