package Day8;

public class TestExceptions {
    public static void main(String[] args) {

        try {
            int num=Integer.parseInt("123");
            System.out.println(num); //where the error happens from there we directly jump to catch block skipping entire remaining try block
            num=num/0;
        }
        catch (NumberFormatException e){
            System.out.println("invalid number"); //NumberFormatException and ArithmeticException are child classes of Exception
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        catch (Exception e){
            System.out.println("Exception"); //we put general catch block at the end because Exception is parent class
        }
        finally {
            System.out.println("Always executed");
        }
    }
}
