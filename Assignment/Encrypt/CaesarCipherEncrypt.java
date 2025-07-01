package Assignment.Encrypt;

import java.io.*;
import java.util.Scanner;

public class CaesarCipherEncrypt {

    private String inputFile = "/Users/harshada/Desktop/Java/Assignment/Encrypt/input.txt";
    private String encryptedFile = "/Users/harshada/Desktop/Java/Assignment/Encrypt/encrypted.txt";
    private String decryptedFile = "/Users/harshada/Desktop/Java/Assignment/Encrypt/decrypted.txt";


    String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        FileInputStream fis = new FileInputStream(filePath);
        int ch;

        while ((ch = fis.read()) != -1) {
            content.append((char) ch);
        }

        fis.close();
        return content.toString();
    }

    void writeFile(String filePath, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        fos.write(content.getBytes());
        fos.close();
    }


    String encrypt(String plainText, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' + shift) % 26) + 'A');
                encrypted.append(ch);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' + shift) % 26) + 'a');
                encrypted.append(ch);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    String decrypt(String encryptedText, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' - shift) % 26) + 'A');
                decrypted.append(ch);
            }
            else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' - shift) % 26) + 'a');
                decrypted.append(ch);
            }
            else  {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }



    public static void main(String[] args) throws IOException {
        CaesarCipherEncrypt cipherEncrypt = new CaesarCipherEncrypt();
        cipherEncrypt.readFile(cipherEncrypt.inputFile);
        cipherEncrypt.writeFile(cipherEncrypt.encryptedFile, cipherEncrypt.decryptedFile);

    }
}
