package prog1.uebungsblatt7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String stringToTokenize = sc.nextLine();
		
		StringTokenizer tokens = new StringTokenizer(stringToTokenize);
		
//		String[] s = new String[tokens.countTokens()];
//		
//		int i = s.length-1;
//				
//		while(tokens.hasMoreTokens()) {
//			s[i--] = tokens.nextToken();
//		}
//		
//		System.out.println(Arrays.deepToString(s));
		
		String[] s;
		
		s = stringToTokenize.split(" ");
		
		int i  = s.length-1;
		
		while(i >= 0) {
			System.out.println(s[i]);
			i--;
			
		}
		

	}

}
