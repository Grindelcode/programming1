package prog1.uebungsblatt3;

import java.util.Scanner;

public class Vokale {

	public static void main(String[] args) {
		
		char c;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Bitte Satz eingeben: ");
		String satz = sc.nextLine();
		
		int aa = 0, ee = 0, ii = 0, oo= 0, uu = 0, sz = 0;
		
		int i = 0;
		char vokal;
		
		while(i < satz.length()) {
			vokal = satz.charAt(i);
			i++;
			
			switch(vokal) {
			case 'A':
			case 'a':
				aa++;
				break;
			case 'E':
			case 'e':
				ee++;
				break;
			case 'I':
			case 'i':
				ii++;
				break;
			case 'O':
			case 'o':
				oo++;
				break;
			case 'U':
			case 'u':
				uu++;
				break;
				default:
					sz++;
			}
		}
		
		System.out.println("a: " + aa);
		System.out.println("a: " + ee);
		System.out.println("a: " + ii);
		System.out.println("a: " + oo);
		System.out.println("a: " + uu);
		System.out.println("Kons. u. Sonderzeichen: " + sz);
		
		System.out.println("Beenden  (j oder n)");
		
		c = sc.nextLine().charAt(0);
		
		}while(c != 'j');
	}

}
