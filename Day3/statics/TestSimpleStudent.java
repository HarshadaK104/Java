package Day3.statics;

public class TestSimpleStudent {
    public static void main(String[] args) {
        Student student1 = new Student(); 
        Student student2 = new Student();
        Student student3 = new Student();

        Student.getStudentCount(); //static variable and methods both are generally accessed using class name, even if u use a object name it still gives result
        
    }
}
