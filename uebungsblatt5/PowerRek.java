package prog1.uebungsblatt5;

public class PowerRek {
	
	public static double power(int base, int exponent) {
		if(exponent > 1) {
			return base*power(base, exponent-1);
		} else {
			return base;
		}
	}

	public static void main(String[] args) {
		System.out.println(power(3,3));
	}

}
