package prog1.uebungsblatt4;

public class Arrays {

	public static void main(String[] args) {
		
		final int ARRAY_SIZE = 10;
		
		float[] fractions = new float[ARRAY_SIZE];
		
		for(int i=0; i < fractions.length; i++) {
			fractions[i] = 0f;
		}
		
		fractions[3] = 4.5f;
				
		fractions[ARRAY_SIZE-1] = 5.3f;
		
		float total = 0;
		
		for(int i = 0; i < fractions.length; i++) {
			total+= fractions[i]; 
		}

	}

}
