package Java_Task;

import java.util.Arrays;
import java.util.Scanner;

public class CitySorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // READ CITY NAMES 
        System.out.println("Enter the name of 1st City: ");
        String city1 = scanner.nextLine();
        System.out.println("Enter the name of 2nd City: ");
        String city2 = scanner.nextLine();

        String[] cities = {city1,city2};
        Arrays.sort(cities);

        System.out.println("Cities in Aplhadetic Order");
        for (String city : cities){
            System.out.println(city);
        }
    } 
}
