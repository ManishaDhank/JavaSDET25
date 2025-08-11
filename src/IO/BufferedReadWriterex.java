package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWriterex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt"));
		
		bw.write("I am the Buffered file Writer");
		
		bw.close();
		
		//read the file
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt"));
		
		String line;
		
		while ((line = br.readLine())!= null) {
			System.out.println(line);
		}
		
		br.close();
		
	}

}
