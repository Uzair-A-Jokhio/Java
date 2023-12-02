package University.Faculty;

public class Professors extends _FacultyMember{

    public Professors(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    

    public void bewellnessCounselor( ){
        System.out.println("Professor : " + getName() + " is a wellness Conselor");
    }
}