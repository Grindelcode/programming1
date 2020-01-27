package prog1.uebungsblatt7;

import java.util.Scanner;

public class WordChanger {
	
	private StringBuffer s;
	
	public WordChanger(String input) {
		this.s = new StringBuffer(input);
	}
	
	private int findWordEnd(int startIndex) {
		
		int endIndex = startIndex;
		
		while(endIndex != s.length() && !isDelimiter(s.charAt(endIndex))) {
			endIndex++;			
		}
		
		if(endIndex == startIndex) {
			return endIndex;
		}else {
			return endIndex-1;
		}
		
	}
	
	private boolean isDelimiter(char c) {
		
		char[] delimiter = {' ','.',':','|','!'};
		
		for(char current : delimiter) {
			if(c == current) {
				return true;
			}
		}
		
		return false;
	}

	public String changeWords() {
		
		int wordEnd = 0;
		
		for(int i=0; i < s.length(); i = wordEnd ) {
			
			wordEnd = findWordEnd(i);
			
			if(wordEnd == i) {
				wordEnd++;
			}else {
				changeCharsInWord(i, wordEnd);
			}
				
		}
		
		return s.toString();
	}
	

	private void changeCharsInWord(int startIndex, int endIndex) {
		
		
		for(int i = startIndex + 1, j = endIndex -1; i < j; i++,j--) {
			
			char c = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, c);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte text eingeben:");
		
		String input = sc.nextLine();
		
		WordChanger wc = new WordChanger(input);
		
		System.out.println(wc.changeWords());

	}



	

}
