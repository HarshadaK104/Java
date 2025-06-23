package Day1
public class ReportGenerator {
    private String studentName;
    private Integer rollNo;
    private Integer year;
    private Float marksObtained;
    private Float total_Marks;

    public ReportGenerator(String studentName, int rollNo, int year, float marksObtained, float totalMarks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.year = year;
        this.marksObtained = marksObtained;
        this.total_Marks = totalMarks;
    }

    public float getPercentage() {
        return (marksObtained / total_Marks) * 100;
    }

    public String getGrade() {
        float percentage = getPercentage();
        if (percentage < 40) {
            return "Fail";
        } else if (percentage < 50) {
            return "Pass Class";
        } else if (percentage < 60) {
            return "Second Class";
        } else if (percentage < 70) {
            return "First Class";
        } else {
            return "Distinction";
        }
    }

    public void printReportCard() {
        System.out.println("Report Card");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Year: " + year);
        System.out.println("Grade: " + getGrade());
    }
}
