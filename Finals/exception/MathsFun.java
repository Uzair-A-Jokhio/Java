package Finals.exception;

/*
Question no 8:- Write suitable code to calculate the factorial fulfilling following
conditions
[Use exceptional handling or extended exceptional handling]
If user enter a negative number Message : “Number should be
positive”
If user enter non-integer value Message : “Invalid Input”
If user enter a non-zero/positive Calculate factori
 */
public class MathsFun {

    public  long factorialcalculator(int n){
        if (n ==0 || n==1){
            return 1;
        } else {
            return n * factorialcalculator(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer to calculate factorial: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new InvalidInputException("Number should be positive.");
            }

            MathsFun fun = new MathsFun();
            int factorial = fun.factorialcalculator(number);
            System.out.println("Factorial of " + number + " is: " + factorial);

        } catch (InputMismatchException e)
         {
            System.out.println("Error: Invalid input. ");
        } catch (InvalidInputException e)
         {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}