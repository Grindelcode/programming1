package prog1.uebungsblatt5;

public class FibonacciRek {
	
		public static long fib(int index) {
			
			if(index < 0) {
				return -1;
			}
			
			if(index <= 1) {
				return index;
			}else {
				return fib(index-1) + fib(index-2);
			}
		}

	public static void main(String[] args) {
		int n = 12;
		
		System.out.println("f" + n + " = " + fib(n));
		
		for(int i=1; i <= 15; i++) {
			System.out.print(" " + fib(i));
		}

	}

}
