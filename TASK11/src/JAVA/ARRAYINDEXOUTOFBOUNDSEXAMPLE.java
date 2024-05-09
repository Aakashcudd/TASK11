package JAVA;

public class ARRAYINDEXOUTOFBOUNDSEXAMPLE {

		    public static void main(String[] args) {
		        int[] numbers = {1, 2, 3, 4, 5};

		        try {
		            // Trying to access an index outside the bounds of the array
		            int element = numbers[10]; // This will throw ArrayIndexOutOfBoundsException
		            System.out.println("Element: " + element);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            // Handling the exception
		            System.out.println("Error: Array index out of bounds.");
		        }
		    }

	}


