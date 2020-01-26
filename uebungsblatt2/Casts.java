package prog1.uebungsblatt2;

public class Casts {
		public static void main(String []args) {
			int zaehler = 14;
			int nenner = 4;
			
			float quotient;
			
			quotient = zaehler/nenner;
			
			System.out.println(quotient);
			
			quotient = (float) (zaehler/nenner);
			
			System.out.println(quotient);
			
			quotient = (float)zaehler/nenner;
			
			System.out.println(quotient);
			
			quotient = zaehler/(float)nenner;
			
			System.out.println(quotient);
									
		}
}
