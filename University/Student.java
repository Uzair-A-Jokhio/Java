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

    public boolean isAsleep(int hr){ return 2 < hr && 8 > hr ;}





    public int getSID(){return this.studentID;}
    public void setgpa(double x){this.gpa = x;}
    public double getgpa(){return this.gpa;}

}
