package prog1.uebungsblatt5;

public class Mystery {
	
	public static int mystery(int a, int b) {
		if (b == 1)
			return a;
		else 
			return a + mystery(a, b - 1);
	}

	public static void main(String[] args) {
		System.out.println(mystery(5,4));

	}

}
