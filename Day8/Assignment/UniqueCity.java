package Day8.Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCity {
    public static void main(String[] args) throws DuplicateCityException {
        HashSet<String> CitySet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add City");
            System.out.println("2. Display City List");
            System.out.println("3. Check if Delivery is available");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)  {
                case 1:
                    System.out.println("Please enter the name of the city:");
                    String city = sc.nextLine();
                    if(CitySet.contains(city)){
                        throw new DuplicateCityException("City Already exists in list");
                    }
                    CitySet.add(city);
                    break;
                case 2:
                    System.out.println("Cities in delivery list:");
                    CitySet.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Please enter the name of the city:");
                    String displayCity = sc.nextLine();
                    if (CitySet.contains(displayCity)) {
                        System.out.println("Delivery is available in " + displayCity);
                    } else {
                        System.out.println("Delivery is NOT available in " + displayCity);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
