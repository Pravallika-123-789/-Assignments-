package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createwritingfile {
	public static void main(String[] args) {  
	    try {  
	      File myObj = new File("C:\\Users\\Lenovo\\filename.txt");  
	      if (myObj.createNewFile()) {  
	        System.out.println("File created: " + myObj.getName());  
	        System.out.println("Absolute path: " + myObj.getAbsolutePath());  
	      } else {  
	        System.out.println("File already exists.");  
	      }  
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();  
	    }  
	
	
		 
		    try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

}
