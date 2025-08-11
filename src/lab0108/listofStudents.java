package lab0108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class listofStudents {

	public static void main(String[] args) throws IOException {
	
		   List<String> students = Arrays.asList("Ravi", "Manisha", "Amit", "Sneha", "Karan");

	       
		   BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt"));
			
		   for (String student : students) {
	            bw.write(student);
	            bw.newLine();  
	        }
			
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