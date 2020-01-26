package prog1.uebungsblatt5;

public class MathUtil {
	
	public static boolean isEven(int i) {
		return i % 2 == 0;
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			if(a > b) {
				a = a-b;
			} else {
				b = b-a;
			}
		}
		
		return a;
		
	}
	
	public static float minimum3(float a, float b, float c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public static int integerPower (int base, int exponent) {
		return (int) Math.pow(base, exponent);
	}
	
	public static String printAsteriks(int size) {
		String output = "";
		
		for(int i=1; i <= size; i++) {
			for(int j=1; j <= size; j++) {
				output = output + "*";
			}
			output = output + "\n";
			
		}
		
		return output;
	}

	public static void main(String[] args) {
		System.out.println(isEven(13));
		System.out.println(gcd(44,52));
		System.out.println(minimum3(12, 33, 80));
		System.out.println(integerPower(3, 3));
		System.out.println(printAsteriks(6));
		
		
		
		

	}

}
