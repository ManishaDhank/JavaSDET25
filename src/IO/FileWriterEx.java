package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		// write to File using file writer
		
		FileWriter fw= new FileWriter("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");
		
		fw.write("I am the file writer");
		
		fw.close();
		
		//reading from file using file reader
		
		FileReader fr= new FileReader("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");
		
		int i;
		
		while((i =fr.read()) !=-1) {
			System.out.print((char)i);
			
		}
		fr.close();
	}

}
