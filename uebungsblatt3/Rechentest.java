package prog1.uebungsblatt3;

import java.util.Scanner;

public class Rechentest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int operator = (int) (Math.random()*4);
			int input;
			
			int op1 = (int) (Math.random()*32);
			int op2 = (int) (Math.random()*32);
			
			switch(operator) {
			case 0:
				System.out.println(op1 + "+" + op2 + "=\n>");
				input = sc.nextInt();
				
				if(input == op1 + op2) {
					System.out.println("Wow. Das war richtig.");
				}else {
					System.out.println("Denke nochmals nach!");
				}
				break;
			case 1:
				System.out.println(op1 + "-" + op2 + "=\n>");
				input = sc.nextInt();
				
				if(input == op1 - op2) {
					System.out.println("Wow. Das war richtig.");
				}else {
					System.out.println("Denke nochmals nach!");
				}
				break;
			case 2:
				System.out.println(op1 + "x" + op2 + "=\n>");
				input = sc.nextInt();
				
				if(input == op1 * op2) {
					System.out.println("Wow. Das war richtig.");
				}else {
					System.out.println("Denke nochmals nach!");
				}
				break;
			case 3:
				if(op2 != 0) {
				System.out.println(op1 + ":" + op2 + "=\n>");
				input = sc.nextInt();
				
				if(input == op1 / op2) {
					System.out.println("Wow. Das war richtig.");
				}else {
					System.out.println("Denke nochmals nach!");
				}
				break;
			}
				
				
		}
			
			System.out.println();

	}

}
}
