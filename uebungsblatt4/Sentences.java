package prog1.uebungsblatt4;

public class Sentences {

	public static void main(String[] args) {
		
		String article[] = {"the ", "a ", "one ", "some ", "any "};
		String noun[] = {"boy ", "girl ", "dog ", "town ", "car "};
		String verb[] = {" drove", " jumped", " ran", " walked", " skipped"};
		String preposition[] = {" to ", " from ", " over ", " under ", " on "};
		
		String output;
		
		for(int j=1; j <=20; j++) {
			
			int a = (int) (Math.random()*5);
			int n = (int) (Math.random()*5);
			int v = (int) (Math.random()*5);
			int p = (int) (Math.random()*5);
			int a2 = (int) (Math.random()*5);
			int n2 = (int) (Math.random()*5);
			
			output = "" + article[a] + noun[n] + verb[v] + preposition[p] + article[a2] + noun[n2] + ".";
			
			System.out.println(output);
		}

	}

}
