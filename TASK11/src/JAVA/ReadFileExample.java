package JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
   
       public class ReadFileExample {
	    public static void main(String[] args) {
	        String filePath = "path/to/your/file.txt";

	        try {
	            File file = new File(filePath);
	            Scanner scanner = new Scanner(file);

	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("The specified file does not exist.");
	            e.printStackTrace();
	        }
	    }
	}

