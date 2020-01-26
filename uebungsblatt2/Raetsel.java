package prog1.uebungsblatt2;

public class Raetsel {

	public static void main(String[] args) {
		
		double a = 5;
		int b = 9;
		int d;
		int h1=32;
		
		d=Integer.parseInt(args[0]);
		
		System.out.println("Input: " + d);
		
		a=d-h1;
		
		a=a*(a/b);
		
		// Hier kommt das Ergebnis
		System.out.println("Output:" + a);
		
		
	}

}
