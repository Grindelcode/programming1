package prog1.uebungsblatt3;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		
		double piValue = 0;
		double num = 4.0;
		double denom = 1.0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben Sie die Anzahl der Terme ein:");
		int accuracy = sc.nextInt();
		
		System.out.println("Genauigkeit/Anzahl der Terme" + accuracy);
		String output = "";
		
//		for(int term = 1; term <= accuracy; term++) {
//			
//			if(term % 2 !=0) {
//				piValue += num/denom;
//			} else {
//				piValue -= num/denom;
//			}
//			
//			output += "\n" + term + "\t\t" + piValue;
//			denom += 2.0;
//			}
		
		int term = 1;
		
		do {
			if(accuracy ==0) break;
			
			if(term % 2 !=0) {
				piValue += num/denom;
			} else {
				piValue -= num/denom;
			}
			
			output += "\n" + term + "\t\t" + piValue;
			denom += 2.0;
			
			
			term++;
		}while(term <= accuracy);
		
		System.out.println(output);
	}

}
