package Day5.Problem;

public class TestWorkStation {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        Workstation ws = new Workstation(printer, scanner, 60);

        System.out.println("Can fit on table: " + ws.canFitOnTable());  // true
        ws.useDevices();  // Printing... \n Scanning...
    }
}
