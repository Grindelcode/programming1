package prog1.uebungsblatt7;

public class Sentences {

	public static void main(String[] args) {
		String[] article = {"the ","a ","one ", "some ", "any " };
		String[] noun = {"boy","girl","town", "dog", "car" };
		String[] verb = {" drove"," jumped"," ran", " walked", " skipped" };
		String[] preposition = {" to "," from "," over ", " under ", " on " };
		
		StringBuffer output = new StringBuffer();
		
		for(int i=1; i <= 50; i++) {
			int a = (int) (Math.random()*5);
			int n = (int) (Math.random()*5);
			int v = (int) (Math.random()*5);
			int p = (int) (Math.random()*5);
			int a2 = (int) (Math.random()*5);
			int n2 = (int) (Math.random()*5);
			
			StringBuffer s = new StringBuffer();
			
			s.append(article[a] + noun[n] + verb[v] + preposition[p] + article[a2] + noun[n2] + ".\n");
			
			s.setCharAt(0, Character.toUpperCase(s.charAt(0)));	
			output.append(s.toString());
		}
		
		System.out.println(output);
	}

}
