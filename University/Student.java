package University;

public class Student extends Person {

    private double gpa;
    private int studentID;

    public Student(String name, int Id) {
        super(name);
        this.studentID = Id;
    }

    public String toString(){
        return this.getSID() + ": " + super.getName() ;
    }





    
    public int getSID(){return this.studentID;}
    public void setgpa(double x){this.gpa = x;}
    public double getgpa(){return this.gpa;}

}
