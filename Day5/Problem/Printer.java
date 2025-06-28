package Day5.Problem;

class Printer extends Product implements Printable {
    public void print() {
        System.out.println("Printing...");
    }

    public int getWidth() {
        return 30;
    }

    public String getName() {
        return "Printer";
    }
}



