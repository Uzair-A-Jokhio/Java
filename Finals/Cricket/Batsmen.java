package Finals.Cricket;

public class Batsmen extends Player {
    private double strike_rate;
    private double average;

    public Batsmen(String name, int age, double s_r, double avg){
        super(name, age);
        this.strike_rate = s_r;
        this.average = avg;
    }
}
