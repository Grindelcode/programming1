package prog1.uebungsblatt5;

public class Fermat {

	
	
	
	
	
	
	
	
	
	
	
	public static int pow(final int a,int k, final int b) {
		long x = a;
		long z = 1;
		while (k > 0)
			if (k%2 == 0) {
				k /= 2;
				x = x*x%b;
			} else {
				k--;
				z = z*x%b;
			}
		return (int) z;
	}
	
	
	
	public static boolean fermatTest(final int n, final int a) {
		return pow(a, n-1, n) % n == 1;
	}
	
	public static boolean isPrime(final int n) {
		int a = 0;
		for (int i = 0; i < 100; i ++) {
			a = (int) (Math.random()*(n-1)+1);
			
			if(!fermatTest(n, a)) {
				return false;
			}
		}
		System.out.println("a = " + a);
		return true;
	}
	
	public static int randomPrime() {
		int n;
		
		do {
			 n = (int) (Math.random()*(Integer.MAX_VALUE-1))+2;
		}while (!isPrime(n));
		return n;
		}
	
	
	public static void main(final String[] args) {
		System.out.println(fermatTest(999983, 17)); //true
		System.out.println(fermatTest(999984, 17)); //false
		
		System.out.println(isPrime(999983));
		System.out.println(isPrime(999984));
		
		System.out.println(randomPrime());
	}
}
