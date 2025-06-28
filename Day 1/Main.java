package Day1;
public class Main {
    public static void main(String[] args) {
        
        String name = "Harshada Kate";
        int rollNo = 101;
        int year = 2025;
        float marksObtained = 987;
        float totalMarks = 1200;

        ReportGenerator report = new ReportGenerator(name, rollNo, year, marksObtained, totalMarks);
        report.printReportCard();
        report.getGrade();
    }
}
