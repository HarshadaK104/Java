package Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFiles {
    void readFile() throws IOException {
        FileReader fr = new FileReader("/Users/harshada/Desktop/Java/Day9/file.txt");
        int ch=0;

        System.out.println("Reading file");

        while((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }

    void writeFile() throws IOException {
        String message = "This is data2."; //write this in file
        FileWriter fw = new FileWriter("output.txt");
        fw.write(message);
        fw.close();

    }

    public static void main(String[] args) throws IOException {
        CharFiles obj = new CharFiles();
        System.out.println("Reading file");
        obj.readFile();
        System.out.println("Writing data to the file");
        obj.writeFile();
    }
}
