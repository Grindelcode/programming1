package prog1.uebungsblatt3;

public class PythagoTriple {

	public static void main(String[] args) {
		
		int a,b,c;
		
		int counter = 1;
		
		for(a = 1; a <= 500; a++) {
			for( b = 1; b <= 500; b++) {
				for( c = 1; c <= 500; c++) {
					if((a*a) + (b*b) == (c*c)) {
						System.out.println(counter + ") a: " + a + " b: " + b + " c: " + c);
						counter++;
					}
				}
			}
		}

	}

}
