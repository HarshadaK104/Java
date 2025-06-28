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
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter the name of the city:");
                    String addCity = sc.nextLine();
                    citySet.add(addCity);
            }
        }
    }
}
