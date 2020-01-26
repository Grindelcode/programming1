package prog1.uebungsblatt2;



public class Primtest {

	public static void main(String[] args) {

		for(int i = 1; i <= 1000; i++) {
			
			if (i == 1) {
				System.out.println("1 ist keine Primzahl");
			} else {
				boolean isprim = true;
				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						isprim = false;
						break;	
					}
				}
				
				if(isprim) System.out.println("" + i + " ist Primzahl");
			}
		}
		
		

	}

}
