package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationex {

	public static void main(String[] args) throws IOException {
		
		// serialization is the process of converting objects into bytes
		
		// writes Object()
		
		//Creating the Object
		
		try {
			Student s1 = new Student(211, "John");
			
			//creating the output stream writing the object
			
			FileOutputStream fout= new FileOutputStream("C://Users//Manisha//OneDrive//Documents//wipro.txt");
			
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(s1);
			
			out.flush();
			
			//closing the stream
			
			fout.close();
			
			out.close();
			
			System.out.println("Object is synchronized");
		

		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


