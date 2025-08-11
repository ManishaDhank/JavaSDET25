package IO.ByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			
	
			FileOutputStream fos= null;
			
			FilterOutputStream  filteroutput =null;
			
			try {
				
				// create file output stream for the file
				
				fos=new FileOutputStream("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");
				
				//wrap file input stream with buffered input stream
				
				filteroutput =new BufferedOutputStream(fos);
				
				//write data into the file
				
				String text ="Hi who are you";
				
				filteroutput.write(text.getBytes());
				
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
			finally {
				filteroutput.close();
				fos.close();
			}
			
		}
	}

