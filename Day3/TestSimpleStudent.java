package Day3;

public class TestSimpleStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);

        //Student student = new Student(10,"Harshada",80.6f);
        student.printDetails();
    }
}
