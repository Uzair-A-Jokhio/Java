package Finals;

/*          QUS No 2
Develop a class DATE_TIME with to create the object of 8th April
2019 at 10:00AM
 */

public class DateTime {
    private int day;
    private String month;
    private int year;
    private int hour;
    private int min;

    public DateTime(int day,String month,int year, int hour,int min ){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    public void ShowDate(){
        System.out.println(day + "th " + month + year + " at " + hour + ":" + min + "AM");
    }

    public static void main(String[] args){
        DateTime time = new DateTime(8, "April ", 2019, 10, 00);
        time.ShowDate();
    }
}
