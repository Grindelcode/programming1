package prog1.uebungsblatt4;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Zeilenanzahl eingeben");
		int r = sc.nextInt();
		
		System.out.println("Bitte Spaltenanzahl eingeben");
		int c = sc.nextInt();
		
		int[][] array = new int[r][c];
		
		//array füllen
		for(int i=0; i < r; i++) {
			for(int j=0; j < c;j++) {
				array[i][j] = (int) (Math.random()*10);
			}
		}
		
		//array reihe ausgeben
		
		for(int i=0; i < r; i++) {
			int rsum = 0;
			for(int j=0; j < c; j++) {
				
				rsum += array[i][j];
				
				System.out.print("   " + array[i][j]);
			}
			
			System.out.println(" || " + rsum + "\n");
		}
		
		for(int i=0; i < c; i++) {
			System.out.print("=====");
		}
		
		System.out.println();
		
		for(int i=0; i < c; i++) {
			int sum = 0;
			
			for(int j=0; j < r; j++) {
				sum += array[j][i];
			}
			
			System.out.print("  " + sum);
		}
		
		System.out.println("\n");
		

	}

}
