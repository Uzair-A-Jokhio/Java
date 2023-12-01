package University;

public class Person extends Object {
    
    private String name;
    private int age;
    private String gender;
    private String PhoneNum;

    public Person(String name){
        super();

    }


    // Name
    public void setName(String na) {this.name = na;}
    public String getName() {return this.name;}
    // Age
    public void setAge(int a){this.age = a;}
    public int getAge(){return this.age;}
    // gender
    public void setGender(String gen){this.gender=gen;}
    public String getGender(){return this.gender;}
    // Phone nummber
    public void setPhoneNum(String Phonenum){this.PhoneNum=Phonenum;}
    public String getPhoneNum(){return this.PhoneNum;}

}