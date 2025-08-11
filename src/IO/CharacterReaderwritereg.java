package IO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharacterReaderwritereg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[] input = "Java Char Streams!".toCharArray();

	        // Create reader and writer
	        CharArrayReader reader = new CharArrayReader(input);
	        CharArrayWriter writer = new CharArrayWriter();

	        int ch;

	        try {
	            // Read each character and write uppercase version
	            while ((ch = reader.read()) != -1) {
	                writer.write(Character.toUpperCase((char) ch));
	            }

	            // Convert written characters to char array or string
	            char[] result = writer.toCharArray();
	            String output = writer.toString();

	            // Display the result
	            System.out.println("Original : " + new String(input));
	            System.out.println("Modified : " + output);

	            reader.close();
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


