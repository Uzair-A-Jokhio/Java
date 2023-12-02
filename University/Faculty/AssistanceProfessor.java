package University.Faculty;

public class AssistanceProfessor extends _FacultyMember {

    public AssistanceProfessor(String name){
        super(name);

    }

    public void beAdvisor(){
        System.out.println("Assistance Professor :" + getName() + " is a Advisor");
    }
}
