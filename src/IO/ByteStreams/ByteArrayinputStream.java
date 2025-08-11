package IO.ByteStreams;

import java.io.ByteArrayInputStream;


public class ByteArrayinputStream {

	public static void main(String[] args) {
		
		//read the array of input data bytes
		byte[] array= {1, 2, 3, 4};
		
		try {
			ByteArrayInputStream input = new ByteArrayInputStream (array);

			for(int i=0; i<array.length; i++) {
				
				
				// read the bytes
				int data =input.read();
			
				System.err.print(data);
				
			
				
			}
			input.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
}
		
	}


