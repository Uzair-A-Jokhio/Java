 package Java_Task;


 /*
Q3.) 
The Java class called Holiday is started below. An object of class Holiday represents a holiday during the year. This class has three instance
● Name, which is a String representing the name of the holiday 
● Day, which is an int representing the day of the month of the holiday 
● Month, which is a String representing the month the holiday is in public class Holiday
{private String name;
{ private String name; private int day; private String month;
// your code goes here
}
a) Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String
Representing the month as its arguments, and sets the class variables to these values
b.) Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value true if they have the same month, and false if they do not.
  */
  
public class Holiday {
    private String name, month;
    private int day;


    public Holiday(String name, int day, String month){ //constructor 
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday ){ //method 
        return this.month == otherHoliday.month;
    }

    public static void main(String[] args) {
        Holiday h1 = new Holiday("Christmas ", 25, "Dec");
        Holiday h2 = new Holiday("Quaid Birthday", 25, "Jan");

        boolean sameMonth = h1.inSameMonth(h2); // call method 
        System.out.println("Is same Month : " +  sameMonth);

    }
}