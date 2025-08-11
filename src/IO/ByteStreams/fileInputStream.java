package IO.ByteStreams;

import java.io.FileInputStream;

public class fileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream input = new FileInputStream ("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");
			System.out.println("Data in File");
			
			//reads the byte
			
			int i=input.read();
			
			while(i != -1) {
				System.out.print((char)i);
				
				//reads the next byte from file
				
				i=input.read();
				
			}
			input.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
}
}
