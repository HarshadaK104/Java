package Day8;

public class PasswordFormatException extends Exception {
    public PasswordFormatException(String message) {
        super(message);
        //all exceptions that extend exception are checked
        // if serious then extend Exception, because checked
        //if unserious then extend RunTimeException, because unchecked
    }
}
