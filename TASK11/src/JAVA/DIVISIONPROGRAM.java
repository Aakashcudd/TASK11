package JAVA;

import java.util.Scanner;

public class DIVISIONPROGRAM {

		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first integer:");
		        int dividend = scanner.nextInt();

		        System.out.println("Enter the second integer:");
		        int divisor = scanner.nextInt();

		        try {
		            // Perform division
		            int result = divide(dividend, divisor);
		            System.out.println("Result of division: " + result);
		        } catch (ArithmeticException e) {
		            // Handle division by zero exception
		            System.out.println("Error: Division by zero is not allowed.");
		        }

		        scanner.close();
		    }

		    // Method to perform division
		    public static int divide(int dividend, int divisor) {
		        if (divisor == 0) {
		            // If divisor is zero, throw ArithmeticException
		            throw new ArithmeticException("Division by zero");
		        }
		        return dividend / divisor;
		    }

	}

