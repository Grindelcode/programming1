package prog1.uebungsblatt5;

public class Temperature {
	
	public static float toCelsius (float fahrenheit) {
	return (5.0f / 9.0f * (fahrenheit-32));
	
	
	}
	
	public static float toFahrenheit(float celsius) {
	return (9.0f / 5.0f * celsius+32);
		
	}
	
	
	

	public static void main(String[] args) {
		
		float[] fahrenheitValues = { 10.0f, 3.3f, 5.5f, 45.5f };
		float[] celsiusValues = { -10.0f, 0.0f, 16.5f, 36.0f };
		
		System.out.println("Conversion Fahrenheit to Celsius: ");
		
		for(int i = 0; i < fahrenheitValues.length; i++) {
			System.out.println("Fahrenheit: " + fahrenheitValues[i] + "Celsius: " + Temperature.toCelsius(fahrenheitValues[i]));
		}
		System.out.println();
		
		System.out.println("Conversion Celsius to Fahrenheit: ");
		
		for(int i = 0; i < celsiusValues.length; i++) {
			System.out.println("Celsius: " + celsiusValues[i] + "Fahrenheit:  " + Temperature.toFahrenheit(celsiusValues[i]));
		}
	
		

	}

}
