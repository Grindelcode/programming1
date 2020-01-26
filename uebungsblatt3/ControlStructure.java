package prog1.uebungsblatt3;

import java.util.Scanner;

public class ControlStructure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean bedingung = sc.nextBoolean();
		int wert = sc.nextInt();
		
		int i;
		i = 1;
		
		if(i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		if(bedingung) {
			System.out.println("Bedingung ist wahr");
		}
		
//		if(wert == 0) {
//			System.out.println("Wert ist 0");
//		}
//		else if(wert == 1) {
//			System.out.println("Wert ist 1");
//		}
//		else if(wert == 2) {
//			System.out.println("Wert ist 2");
//		}
//		else {
//			System.out.println("Wert ist weder 0, noch 1, noch 2");
//		}
		
		switch(wert) {
		case 0:
			System.out.println("Wert ist 0");
			break;
		case 1:
			System.out.println("Wert ist 1");
		case 2:
			System.out.println("Wert ist 2");
		 default:
			System.out.println("Wert ist weder 0, noch 1, noch 2");
		}
	
	
	
	
	
	}
	
}


