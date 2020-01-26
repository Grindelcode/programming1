package prog1.uebungsblatt1;

public class Sum {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = 0;
		int counter = 1;
		
		while(counter <=n) {
			result = result + counter;
			counter = counter + 1;
			
		}
		
		System.out.println(result);
		
	}
	
	
	
	
	

}
