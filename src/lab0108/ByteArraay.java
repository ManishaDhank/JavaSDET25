package lab0108;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArraay {

    public static void main(String[] args) {

        byte[] byteArray = null;
        FileInputStream fis = null; // Declare outside try so finally can access it

        try {
            // Create File object
            File file = new File("C:\\Users\\Manisha\\OneDrive\\Documents\\wipro.txt");

            // Create FileInputStream
            fis = new FileInputStream(file);

            // Initialize byte array with file length
            byteArray = new byte[(int) file.length()];

            // Read file content into the byte array
            fis.read(byteArray);

            // Print contents as string (for text files)
            System.out.println("File Content:");
            System.out.println(new String(byteArray));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
