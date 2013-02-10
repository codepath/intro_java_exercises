package apollo.exercises.ch02_variables;

// This is a program that has a few compile errors.
// See if you can fix the errors and run the program.
public class Ex4_BadDeclaration {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// This program creates a bunch of meaningless
		// integers, but it shows how you declare multiple
		// integers in a single line, or assign a variable
		// in the same line that you declare it.
		//
		// There are a couple of compile errors.  See if you
		// can find and fix the problems.
		
		// Start by uncommenting and fixing all the lines below
		int x;
		// int y
		int a, b, c;
		int d = 3;
		
		x = 3;
		// y = x * 4
		a = 10;
		b = a;
		c = a + b;
		x = x + d;
		
		int e;
		// int x;
		
		e = 4;
		x = 4;
		
		System.out.println(x);
		// System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}

}
