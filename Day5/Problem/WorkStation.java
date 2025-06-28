package Day5.Problem;

class Workstation {
    private Printer printer;
    private Scanner scanner;
    private int tableWidth;

    public Workstation(Printer printer, Scanner scanner, int tableWidth) {
        this.printer = printer;
        this.scanner = scanner;
        this.tableWidth = tableWidth;
    }

    public boolean canFitOnTable() {
        int totalWidth = printer.getWidth() + scanner.getWidth();
        return totalWidth <= tableWidth;
    }

    public void useDevices() {
        printer.print();
        scanner.scan();
    }
}

