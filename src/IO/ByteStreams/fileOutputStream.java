package IO.ByteStreams;


import java.io.FileOutputStream;

public class fileOutputStream {	
	public static void main(String[] args) {
	
	String data="I am attending java training class";
	try {
		FileOutputStream output = new FileOutputStream ("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");

		byte[] array=data.getBytes();
		
		
		output.write(array);
		output.close();
			
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}


