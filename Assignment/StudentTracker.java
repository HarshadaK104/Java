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
            switch (choice) {
                case 1:
                    System.out.println("Please enter the name of the student:");
                    Scanner addName = new Scanner(System.in);
                    attendanceList.add(new Student(addName.nextLine()));
                    attendanceList.forEach(student -> System.out.println(student.getName()));
                    break;
                case 2:
                    System.out.println("Please enter the name of the student:");
                    Scanner removeName = new Scanner(System.in);
                    attendanceList.remove(removeName.nextLine());
                    attendanceList.forEach(student -> System.out.println(student.getName()));
                    break;
                case 3:
                    attendanceList.forEach(student -> System.out.println(student.getName()));
                    break;
                case 4:
                    System.out.println("Please enter the name of the student:");
                    Scanner nameToCheck = new Scanner(System.in);
                    Iterator<Student> iterator = attendanceList.iterator();
                    boolean found = false;
                    while (iterator.hasNext()) {
                        Student s = iterator.next();
                        if (s.getName().equals(nameToCheck)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println(nameToCheck + " attended the class.");
                    } else {
                        System.out.println(nameToCheck + " did not attend the class.");
                    }
                    break;
                case 5:
                    break;
            }
        }


    }
}
