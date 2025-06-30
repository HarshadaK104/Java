package Day8;

import java.io.FileReader;
import java.io.IOException;

public class TestThrowsException {
    int divide(int a,int b)throws ArithmeticException{
        return a/b;
    }

    void readFile() throws IOException {// can also use FileNotFoundException as it is the child of IOException
        //difference between checked and unchecked exceptions
        //exceptions that are silly, that java knows how to handle implicitly,unchecked like
        //the ones which are hard for java to handle, then checked where it is mandatory for either to write try-catch or throws
        FileReader fr = new FileReader("Some file");
    }

    public static void main(String[] args) {
        TestThrowsException test = new TestThrowsException();
        test.divide(1,0);
        //test.readFile();
        //exception propagation, if callee writes a throw then caller will also have to write either try-catch or throws
        //if the callee writes try-catch then caller doesn't have to write anything
        //throws means "not me", try-catch finds the exception and resolves it

    }
}
