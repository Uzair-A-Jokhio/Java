package Games;

/**
 * Random Guessing Game  
 */
import java.util.Scanner;

public class RandomGG {

    public static void GuessingGame(){

        Scanner sc = new Scanner(System.in);
        // Random number 
        int number = 1 + (int)(100 * Math.random());
        
        int k =7; // number of trials 
        int i, guess;
        
        System.out.println("A number is Chosen BY The Guesser\n Between 1 to 100 You only Have 5 Trials\n GOOD Gueesing ;-) ");

        for (i=0; i < k;i++)
        {
            System.out.println("\nGnter The NuMber: ");
            guess = sc.nextInt();

            if (number == guess){
                System.out.println("Congratulations! You have defeated the Gusser");
                break;
            }
            else if (number > guess && i != k-1){
                System.out.println("The Number is Greater than " + guess);
            }
            else if (number < guess && i != k-1){
                System.out.println("The Number is less: " + guess);
            }
        }

        if (i==k){
            System.out.println("\n\tMuwah HA ha Your are Out if Tries :" + number + "\n\tThe Gusser is Laughing ");
        }
    }

}