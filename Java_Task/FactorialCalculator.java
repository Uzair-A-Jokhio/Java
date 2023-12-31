package Java_Task;

import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
