package Inheritance;

public class Student extends Person {
    private double gpa;

    public void setgpa(double x){
        this.gpa = x;
    }

    public double getgpa(){
        return this.gpa;
    }


    public static void main(String[] args){
        Student uzair = new Student();
        Faculty f = new Faculty();
        f.setName("Ali");
        f.setSalary(120000);
        uzair.setName("Uzair");
        uzair.setgpa(3.89);
        System.out.println("Name: " + f.getName());
        System.out.println("Salary: " + f.getSalary());
    }
}
