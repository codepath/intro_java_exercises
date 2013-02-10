package apollo.exercises.ch02_variables;

// This is a program that shows how programs do
// basic math.
public class Ex5_BasicMath {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		int x, y, z;
		x = 5;
		y = 3;
		z = 0;
		
		// Set z to the sum of x and y
		
		System.out.println("The sum of x and y is: " + z);
		
		// Set z to the difference of x and y
		
		System.out.println("The difference of x and y is: " + z);
		
		// Set z to the product of x and y (multiply x by y)
		
		System.out.println("The product of x and y is: " + z);
		
		// Set z to the quotient of x and y (divide x by y)
		
		System.out.println("The quotient of x and y is: " + z);
		
		// Set z to the remainder of x divided by y
		// Hint remainder is found using the mod operator (%) i.e 6 % 3 is 0
		
		System.out.println("The remainder of x divided by y is: " + z);
		
		
		double a = 5.0;
		double b = 3.0;
		double c = 0;
		
		// Set c to the quotient of a and b (divide a by b)
		
		System.out.println("The quotient of a and b is: " + c);
		
		
		// Set z equal to (x * 1.0) / y
		
		System.out.println("The result of x * 1.0 / y is: " + z);
	}

}

/*
 * 
 * SAMPLE OUTPUT:
 *  
 *   The sum of x and y is: 8
 *   The difference of x and y is: 2
 *   The product of x and y is: 15
 *   The quotient of x and y is: 1
 *   The remainder of x divided by y is: 2
 *   
 *   The quotient of a and b is: 1.6667
 *    
 */
