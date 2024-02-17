package Java_Task;

public class Prime {

    public void find_prime_for(){
        System.out.println("Finding Prime by FOR");
        for (int i =1; i <=27;i++){
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    
    public void find_prime_while(){
        System.out.println("Finding Prime by while");
        int i = 1;
        while (i <= 27) {
            if (isPrime(i)){
                System.out.println(i + " ");
        }
        i++;
        }  
    }

    public void find_prime_doWhile(){
        System.out.println("Finding Prime by Do while");
        int i =1;
        do{
            if (isPrime(i)){
                System.out.println(i + " ");
            }
            i++;
        } while(i<=27);
    }

    private  boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
