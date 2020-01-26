package prog1.uebungsblatt1;

public class Power {
	public static void main(String[] args) {
		System.out.println("Zahl\tQuadratt\tKubisch");
		System.out.println("======================");
		
		int n = Integer.parseInt(args[0]);
		int counter = 1;
	
		while(counter <= n) {
			System.out.println(counter + "\t" + counter*counter + "\t" + counter*counter*counter);
		counter = counter + 1;
		
			
		}
		
	}
	
	
	
	
}
