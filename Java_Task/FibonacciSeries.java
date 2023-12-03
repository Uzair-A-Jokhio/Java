package Java_Task;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read the number of terms for Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Display Fibonacci series up to n terms
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Method to calculate Fibonacci number at a given position
    private static int fibonacci(int n){
        if (n <= 1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n-2);
        }
    }
}

