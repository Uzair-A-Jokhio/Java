package Java_Task;

import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial
        if (number >= 0 && number <= 27 ){
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else{

            System.out.println("Out of Bound ");

        }
    }

    // Method to calculate factorial
    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

     // Method to check if a number is prime
     private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find and display prime numbers using for loop
    private static void findPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

    
}
