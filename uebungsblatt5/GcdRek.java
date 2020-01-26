package prog1.uebungsblatt5;

public class GcdRek {
	
	private static int ggt(int a, int b) {
		while(b != 0) {
			if (a > b) {
			a = a - b;
		}else {
			b = b - a;
			}
		}
		return a;
	}

	public static int gcdRek(int a,int b) {
		if(b > 0) {
			if (a < b) {
				a = a-b;
			} else {
				b = b-a;
			}
			
			
	
		
		
		}else {
			return a;
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(ggt(144,66));

	}

}
