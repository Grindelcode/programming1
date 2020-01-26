package prog1.uebungsblatt6;

import java.util.Scanner;

public class QuadratTest {

	public static void main(String[] args) {
	int[][] a1 = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 0 }, { 2, 2, 2, 2 } };
	
	int[][] a2 = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 } };
	
	int[][] a3 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
	
	int[][] a4 = { { 2, 3, 3, 4 }, { 2, 2, 5, 2 }, { 5, 7, 2, 2 }, { 4, 7, 9, 2 } };
	
	int[][] a5 = { { 1, 3, 3, 1}, { 3, 2, 2, 2 }, { 5, 3, 3, 2 }, { 4, 7, 9, 4 } };
	
	Scanner sc = new Scanner(System.in);
	
	Quadrat q = new Quadrat(a1);
	q.print();
	System.out.println("a1: isMagic " + q.isMagic());
	
		q = new Quadrat(a2);
		q.print();
		System.out.println("a2: isMagic " + q.isMagic());
	
			q = new Quadrat(a3);
			q.print();
			System.out.println("a3: isMagic " + q.isMagic());
	
				q = new Quadrat(a4);
				q.print();
				System.out.println("a4: isMagic " + q.isMagic());
	
					q = new Quadrat(a5);
					q.print();
					System.out.println("a5: isMagic " + q.isMagic());
	
	int n;
	
	do {
		System.out.println("Bitte eingeben (n ungerade, n > 2");
		n = sc.nextInt();
	}while(n % 2 == 0 || n < 2);
	
	q = Quadrat.erzeugeMagicQuadrat(n);
	q.print();
	
	System.out.println("isMagic " + q.isMagic());
	}
}

