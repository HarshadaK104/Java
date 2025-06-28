package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTracker {
    public static void main(String[] args) {
        ArrayList<Student> attendanceList = new ArrayList<>();
        while (true) {
            System.out.print("Menu: ");
            System.out.println("1. Add student");
            System.out.print("2. Remove student: ");
            System.out.print("3. Display students: ");
            System.out.print("4. Check if Student Attended: ");
            System.out.print("5. Exit: ");
            System.out.print("Enter Choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the name of the student:");
                    Scanner addName = new Scanner(System.in);
                    attendanceList.add(new Student(addName.nextLine()));
                    attendanceList.forEach(student -> System.out.println(student.getName()));
                    break;
                case 2:
                    System.out.println("Please enter the name of the student:");
                    String nameToRemove = sc.nextLine();
                    boolean removed = attendanceList.removeIf(s -> s.getName().equals(nameToRemove));
                    if(removed) {
                        System.out.println("Student Removed Successfully");
                    }
                    else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 3:
                    attendanceList.forEach(student -> System.out.println(student.getName()));
                    break;
                case 4:
                    System.out.println("Please enter the name of the student:");
                    String nameToCheck = sc.nextLine();

                    boolean found = attendanceList.stream().anyMatch(student -> student.getName().equals(nameToCheck));
                    if (found) {
                        System.out.println("Attendance found");
                    } else {
                        System.out.println("Attendance not found");
                    }

                case 5:
                    break;
            }
        }


    }
}
