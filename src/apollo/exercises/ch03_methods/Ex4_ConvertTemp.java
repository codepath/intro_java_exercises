package apollo.exercises.ch03_methods;

// The program that can convert temperatures
public class Ex4_ConvertTemp {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		// We want to create a program that can convert Fahrenheit temperatures to celsius
		
		double tempFahrenheit = 78;
		
		double tempCelsius = 0;
		// tempCelsius = fahrenheitToCelsius(tempFahrenheit);
		
		System.out.println("Temperature in fahrenheit: " + tempFahrenheit + " degrees");
		System.out.println("Temperature in celsius: " + tempCelsius + " degrees");
		
	}
	
	// Create a method called fahrenheitToCelsius(double tempFahrenheit).
	// This method should convert the temperature from Fahrenheit to
	// Celsius and return the temperature in Celsius
    //
	// HINT: 
	//   ¡F to ¡C:	Deduct 32, then multiply by 5, then divide by 9
	//   ¡C to ¡F:	Multiply by 9, then divide by 5, then add 32

}

/*
 * SAMPLE OUTPUT:
 *  
 *   Temperature in fahrenheit: 78 degrees
 *   Temperature in celsius: 25 degrees
 *   
 */