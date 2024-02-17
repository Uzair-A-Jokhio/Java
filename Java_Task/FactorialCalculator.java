package Java_Task;

/**
 * Write a program that finds factorial of odd numbers from 1 to 27 by using each of three loops(for, while, do-while). 
 */
public class FactorialCalculator {


    public int factorial(int n){
        if ( n==0 || n==1){
            return n;
        } else {
            return n * factorial(n-1);
        }
    }

    public void cal_fact_for(){
        System.out.println("\nUSING FOR LOOPS");
        for (int i =1; i <=27; i +=2){
            System.out.println("Factorial of " + i + " is " + factorial(i) );
        }
    }

    public void cal_fact_while(){
        int i = 1;
        System.out.println("\nUSING FOR while");
        while (i <= 27){
            System.out.println("Factorial of " + i + " is " + factorial(i) );
            i += 2;
        }
    }

    public void cal_fact_dowhile(){
        System.out.println("\nUSING FOR DO while");
        int i =1;
        do{
            System.out.println("Factorial of " + i + " is " + factorial(i) );
            i += 2;
        } while (i <= 27);
    }

    public static void main(String[] args) {
        FactorialCalculator cal = new FactorialCalculator();
        cal.cal_fact_for();
        cal.cal_fact_while();
        cal.cal_fact_dowhile();
    }
}