package Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCity {
    public static void main(String[] args) {
        HashSet<String> citySet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Add City");
            System.out.println("2. Display City List");
            System.out.println("3. Check if Delivery is available");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter the name of the city:");
                    Scanner addCity = new Scanner(System.in);
                    citySet.add(addCity.nextLine());
                    break;
                case 2:
                    citySet.forEach(city -> System.out.println(city));
                    break;
                case 3:
                    System.out.println("Please enter the name of the city:");
                    String displayCity = sc.nextLine();
                    boolean present = citySet.contains(displayCity);
                    if(present){
                        System.out.println("The city is present.");
                    }
                    else{
                        System.out.println("The city is not present.");
                    }
                    break;
                case 4:
                    break;
            }
        }
    }
}
