package Day3;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of students");
        Student[] students = new Student[scanner.nextInt()];//array is initiated as null

        // we create a for loop for repeating and accepting the details of multiple students
        for(int i=0;i<students.length;i++){
        int id= 0;
        String name = null;
        float marks=0f;
        System.out.println("Enter student details");
        System.out.println("Enter id");
        id= scanner.nextInt();
        System.out.println("Enter name");
        name=scanner.next();
        System.out.println("Enter float");
        marks = scanner.nextFloat();

        students[i]=new Student(id,name,marks);
        }
        



    }
}
