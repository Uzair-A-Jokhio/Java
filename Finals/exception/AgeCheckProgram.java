package Finals.exception;

/*      QUS NO 6  part 2
Question no 6:- Develop a program through Custom exception handling /
extended exceptional handling that asks user for his/her age and gives output
under following conditions
• If age is even number
• If age is odd number
• If age is -ve number then user should be prompted that age must be -ve
• If user enters non-integer value then user should be prompted about
invalid input
 */

import java.util.InputMismatchException;
import java.util.Scanner;

 
public class AgeCheckProgram {
 
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 0)        
         {
            throw new InvalidAgeException("Age must be non-negative.");
        } 
        else if (age % 2 == 0)
         {
            System.out.println("Age is an even number.");
        } else
         {
            System.out.println("Age is an odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);

        } catch (InputMismatchException e)
         {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } 
        catch (InvalidAgeException e)
         {
            System.out.println("Error: " + e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }
}

