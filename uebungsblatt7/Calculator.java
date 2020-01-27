package prog1.uebungsblatt7;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		input = input.replaceAll(" ", "");
		
		int operatorPos = 0;
		
		boolean addition = false;
		
		if(input.indexOf("+") != -1) {
			operatorPos = input.indexOf("+");
			addition = true;
		}else if(input.indexOf("*") != -1) {
			operatorPos = input.indexOf("*");
			addition = false;
		}else {
			System.out.println("Falscher Operator. FEHLER!");
		}
		
		if(operatorPos != 0) {
			int zahl1 = Integer.valueOf(input.substring(0, operatorPos));
			int zahl2 = Integer.valueOf(input.substring(operatorPos+1));
			
			if(addition) {
				System.out.println(zahl1 + zahl2);				
			}else {
				System.out.println(zahl1 * zahl2);
			}
		}

	}

}
