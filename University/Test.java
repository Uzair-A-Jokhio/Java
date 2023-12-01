package University;

public class Test {

    public static void main(String[] args) {
        Person s = new Student("shamir", 2226); 
        if (s instanceof Student ){
            // check is "s" is a instance of Student class
            ((Student)s).getSID(); // casting 
        }
    }
    
}
