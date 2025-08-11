package IO;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringreaderWriter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 String text = "I am String writer";

	        // Create StringReader object
	        StringReader reader = new StringReader(text);
	        
	        StringWriter writer = new StringWriter();
	        
	        try {
	            int data;
	         
	            while ((data = reader.read()) != -1) {
	                char ch = (char) data;
	              
	                writer.write(Character.toUpperCase(ch));
	            }

	      
	            String outputText = writer.toString();
	            
	            // Print the result
	            System.out.println(text);
	            System.out.println(outputText);

	            // Close both streams (optional for StringReader/Writer, but good habit)
	            reader.close();
	            writer.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}