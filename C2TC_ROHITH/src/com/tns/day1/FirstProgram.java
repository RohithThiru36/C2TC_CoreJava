package com.tns.day1;
import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=myObj.nextInt();
		System.out.print("Enter Second Number: ");
		int b=myObj.nextInt();
		
		//arithmetic operations
		System.out.println("Arithmetic Operators");
		System.out.println("=======================");
		System.out.println("Addition of "+ a +" + "+ b +": "+(a+b));
		System.out.println("Subration of "+ a +" - "+  b +": "+(a-b));
		System.out.println("Multiplication of "+ a +" * "+ b +": "+(a*b));
		System.out.println("Division of "+ a +" / "+ b +": "+(a/b));
		
		System.out.println("=======================");
			    // value of a and b
		System.out.println("a is " + a + " and b is " + b);

			    // == operator
		System.out.println("a == b : "+(a == b));  // false

			    // != operator
		System.out.println("a == b : "+(a != b));  // true

			    // > operator
		System.out.println("a > b : "+(a > b));  // false

			    // < operator
		System.out.println("a > b : "+(a < b));  // true

			    // >= operator
		System.out.println("a >= b : "+(a >= b));  // false

			    // <= operator
		System.out.println("a <= b : "+(a <= b));  // true

			    	    // assign value using =
		System.out.println("Assigning Operators");
		System.out.println("=======================");
		int var;
		var = a;
		System.out.println("var using =: " + var);

			    // assign value using =+
		var += a;
		System.out.println("var using +=: " + var);

			    // assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);
			    
		System.out.println("Unary Operator");
		System.out.println("=======================");

		int result1, result2;

	    	    // original value
	    System.out.println("Value of a: " + a);

	    	    // increment operator
	    result1 = ++a;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of b: " + b);

	    	    // decrement operator
	    result2 = --b;
	    System.out.println("After decrement: " + result2);	  
	    
	    System.out.println("Ternary Operator");
	    System.out.println("=======================");
	    
	    int februaryDays = 29;
	    String result;

	    // ternary operator
	    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(result);
	    
	    System.out.println("Logical  Operator");
	    
	    Scanner scanner=new Scanner(System.in);
	    System.out.print("Enter the first boolean value (true/false): ");
        boolean firstValue = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean secondValue = scanner.nextBoolean();

        // Logical AND (&&) operator
        boolean andResult = firstValue && secondValue;
        System.out.println("Result of AND operation (firstValue && secondValue): " + andResult);

        // Logical OR (||) operator
        boolean orResult = firstValue || secondValue;
        System.out.println("Result of OR operation (firstValue || secondValue): " + orResult);

        // Logical NOT (!) operator on the first value
        boolean notResult = !firstValue;
        System.out.println("Result of NOT operation (!firstValue): " + notResult);

        // Combining logical operators
        boolean combinedResult = (firstValue && secondValue) || !secondValue;
        System.out.println("Result of combined operation ((firstValue && secondValue) || !secondValue): " + combinedResult);

	}
}
