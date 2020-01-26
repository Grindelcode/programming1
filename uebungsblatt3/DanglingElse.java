package prog1.uebungsblatt3;

public class DanglingElse {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 8;
		
		if (y == 8)
			if (x == 5) {
			System.out.println("@@@@@");
			} else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			}
	}

}
