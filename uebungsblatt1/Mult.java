package prog1.uebungsblatt1;

public class Mult {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int result = 1;
		int counter = 3;
		
		while(counter <= n) {
			result = result + counter;
			counter = counter +1;
		
		}

		System.out.println(result);
	}

}
