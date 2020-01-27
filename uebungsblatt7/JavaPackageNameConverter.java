package prog1.uebungsblatt7;

import java.util.Scanner;

public class JavaPackageNameConverter {
	
	public static String convertUrl2JavaPackageName(String stringurl) {
		StringBuffer url = new StringBuffer(stringurl);
		
		StringBuffer packagename = new StringBuffer();
		
		url = skipHeader(url);
		
		if(url.charAt(0) == '.') url.deleteCharAt(0);
		
		int tokenStartIndex = 0;
		int tokenEndIndex = 0;
		
		while(tokenStartIndex <= url.length()-1) {
			
			tokenEndIndex = url.indexOf(".", tokenStartIndex);
			
			if(tokenEndIndex == -1) {
				tokenEndIndex = url.length();
			}
			
			String token = url.substring(tokenStartIndex, tokenEndIndex);
			
			packagename.insert(0, token);
			packagename.insert(0, ".");	
			
			tokenStartIndex = tokenEndIndex+1;
		}
		
		if(packagename.charAt(0) == '.') {
			packagename.deleteCharAt(0);
		}
		
		return packagename.toString();
		
	}
	
	private static StringBuffer skipHeader(StringBuffer sb) {
		
		if(sb.lastIndexOf("http://") == 0) {
			sb.delete(0, 7);
		}
		
		if(sb.lastIndexOf("www") == 0) {
			sb.delete(0, 3);
		}
		
		if(sb.lastIndexOf("//www") == 0) {
			sb.delete(0, 5);
		}
		
		if(sb.lastIndexOf("//") == 0) {
			sb.delete(0, 2);
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte eine URL eingeben:");
		String input = sc.nextLine();
		
		System.out.println(convertUrl2JavaPackageName(input));

	}

}
