package JAVA;

public class StringIndexOutOfBoundsExample {

		    public static void main(String[] args) {
	        String str = "Hello, World!";

	        try {
	            // Trying to access an index outside the bounds of the string
	            char ch = str.charAt(15); // This will throw StringIndexOutOfBoundsException
	            System.out.println("Character: " + ch);
	        } catch (StringIndexOutOfBoundsException e) {
	            // Handling the exception
	            System.out.println("Error: String index out of bounds.");
	        }
	    }

	}


