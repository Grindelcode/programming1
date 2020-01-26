package prog1.uebungsblatt5;

public class FakRek {
	
	public static long fakultaet(int n) {
		System.out.println(n);
		
		if(n > 1) {
			return (n*fakultaet(n-1));
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(fakultaet(5));
		

	}

}
