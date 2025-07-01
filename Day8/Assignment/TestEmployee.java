package Day8.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) throws EmployeeNotFoundException {
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Fetch Employee");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();
                    employeeHashMap.put(id, new Employee(name));
                    System.out.println("Employee added.");
                    break;
                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    if(!employeeHashMap.containsKey(removeId)){
                        throw new EmployeeNotFoundException("Employee ID does not exist.");
                    }
                    employeeHashMap.remove(removeId);
                    System.out.println("Employee removed.");
                    break;
                case 3:
                    System.out.print("Enter employee ID to fetch: ");
                    int fetchId = sc.nextInt();
                    if(!employeeHashMap.containsKey(fetchId)){
                        throw new EmployeeNotFoundException("Employee ID does not exist."+ fetchId);
                    }
                    Employee emp = employeeHashMap.get(fetchId);
                    System.out.println("Employee Name: " + emp.getName());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
