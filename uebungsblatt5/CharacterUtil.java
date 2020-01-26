package prog1.uebungsblatt5;

import java.util.Arrays;

public class CharacterUtil {
	
	public static boolean vertausche(char[] s, char[] t) {
		
		if(s.length != t.length) return false;
		
		for(int i=0; i < s.length; i++) {
			char c = s[i];
			s[i] = t[i];
			t[i] = c;
		}
		
		return false;
	}
	
	public static void vertausche2(char[] s, char[] t) {
		char[] temp = s;
		s = t;
		t = temp;
		
		
		System.out.println("s: " + Arrays.toString(s));
		System.out.println("t: " + Arrays.toString(t));
		
	}

	public static void main(String[] args) {
		char[] s = { 'S', 'O', 'R', 'T', 'B', 'Y'};
		char[] t = { 'B', 'U', 'B', 'B', 'L', 'E'};
		
		System.out.println("s: " + Arrays.toString(s));
		System.out.println("t: " + Arrays.toString(t));
		System.out.println("-------------------------------");
		vertausche(s, t);
		System.out.println("s: " + Arrays.toString(s));
		System.out.println("t: " + Arrays.toString(t));
		System.out.println("-------------------------------");
		vertausche2(s, t);
		
//		System.out.println("s: " + Arrays.toString(s));
//		System.out.println("t: " + Arrays.toString(t));

	}

}
