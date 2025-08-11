package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationex {

	public static void main(String[] args)  throws FileNotFoundException , IOException, ClassNotFoundException{
	
		//create the stream and read the object
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("C://Users//Manisha//OneDrive//Documents//wipro.txt"));
		
		Student s=(Student)in.readObject();
		
		//printing the object details
		
		System.out.println(s.id + " " + s.name);
		
		in.close();
		
		
	}

}
