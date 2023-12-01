package University;


public class Person extends Object  {
    
    private String name, gender, PhoneNum;
    private int age;



    public Person(String name){this.name = name;}

    public String toString(){return this.getName();}

    public boolean isAsleep(int hr){return 22 < hr  || hr > 7;}

    public void status(int hr){
        if (this.isAsleep(hr))
            System.out.println("Now offline : " + this);
        else
            System.out.println("Now online : " + this);
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