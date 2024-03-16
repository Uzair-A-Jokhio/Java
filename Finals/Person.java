package Finals;

import java.util.Scanner;

/*
Question no 7:-Overload ‘greater than’ (>) operator in such a way that if age of
two person are provided by the user are greater than operator is applied
between then then It must return true or false as per age given
 */
import java.util.Scanner;

public class Person {
    private int age;

    public Person(int age){
        this.age = age;
    }

    public boolean compareAge(Person other){
        return this.age > other.age;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age1 = scan.nextInt();
        Person p1 = new Person(age1);

        System.out.println("Enter 2nd age: ");
        int age2 = scan.nextInt();
        Person p2 = new Person(age2);


        System.out.println(p1.compareAge(p2));
        scan.close();
    }
}
