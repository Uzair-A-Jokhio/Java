import java.util.Scanner;

public class OpenEnd{

    String Name = "Unknown";
    double CGPA = 0;
    String Dept = "Unknown";

    public void display(){
        System.out.println("Name: " + this.Name);
        System.out.println("Department: "+ this.Dept);
        System.out.println("CGPA: " + this.CGPA);
        System.out.println();
    }

    public void getDetail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        this.Name = scanner.nextLine();
        System.out.println("Enter your Department: ");
        this.Dept = scanner.nextLine();
        System.out.println("Enter CGPA: ");
        this.CGPA = scanner.nextDouble();
        scanner.close();
    }

    public static void main(String[] args){
        OpenEnd uzair = new OpenEnd();
        System.out.println("Before input \n");
        uzair.display();
        uzair.getDetail();
        System.out.println("After input\n");
        uzair.display();
    }
}
