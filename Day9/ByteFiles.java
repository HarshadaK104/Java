package Day9;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFiles {
    void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/harshada/Desktop/Java/Day9/file.txt");
        int ch=0;

        System.out.println("Reading file");

        while((ch=fis.read())!=-1){
            System.out.println((char)ch);
        }
        fis.close(); //good practice to close
//        byte[] fileBytes = fis.readAllBytes();
//
//        for (int i = 0; i < fileBytes.length; i++) {
//            System.out.print((char) fileBytes[i]);
//        }
    }
    void writeFile() throws IOException {
        String message = "This is data."; //write this in file
        FileOutputStream fos = new FileOutputStream("/Users/harshada/Desktop/Java/Day9/outputFile.txt");
        System.out.println("Writing data to the file");
        fos.write(message.getBytes());
    }

    public static void main(String[] args) throws IOException {
        ByteFiles bf = new ByteFiles();
//        bf.readFile();
        bf.writeFile();
    }
}
