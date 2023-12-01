package University;

public class Faculty extends Person {

    private double salary;
    private String employeeID;

    public Faculty(String name, String eId) {
        super(name);
        this.employeeID = eId;
    }

    public String toString(){
        return this.getEID() + ": " + super.getName() ;
    }

    
    



    
    public String getEID(){return this.employeeID;} 
    // Salary 
    public void setSalary(double salary){this.salary = salary;}
    public double getSalary(){return this.salary;}
    // ID 
    public void setId(String Id){this.employeeID=Id;}
    public String getId(){return this.employeeID;}
}
