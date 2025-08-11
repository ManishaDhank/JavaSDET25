package IO.ByteStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//filter streams filter data as they read and write the data in the input stream
		
		// filters it and passs it on to the  underlying streams
		
		FileInputStream fis= null;
		
		FilterInputStream  filterinput =null;
		
		try {
			
			// create file input stream for the file
			
			fis=new FileInputStream("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");
			
			//wrap file input stream with buffered input stream
			
			filterinput =new BufferedInputStream(fis);
			
			//read and print file content
			
			int data;
			
			 while((data =filterinput.read()) !=-1) {
				 
				 System.out.print((char)data);
			 }
			 
			 fis.close();
			 
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
