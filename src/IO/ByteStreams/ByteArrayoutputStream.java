package IO.ByteStreams;

import java.io.ByteArrayOutputStream;


public class ByteArrayoutputStream {

	public static void main(String[] args) {

			
			String data="I am attending java training class";
			try {
				// creates an output stream
				
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				byte[] array=data.getBytes();
				
				// Write data to the output stream
				output.write(array);
				
				//Retrieves data from output stream in String format
				
				String streamData=output.toString();
				System.out.println("Output stream : " + streamData);
				
				output.close();
					
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
		
	}

}
