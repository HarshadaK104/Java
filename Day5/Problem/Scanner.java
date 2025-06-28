package Day5.Problem;

class Scanner extends Product implements Scannable {
    public void scan() {
        System.out.println("Scanning...");
    }

    public int getWidth() {
        return 25;
    }

    public String getName() {
        return "Scanner";
    }
}