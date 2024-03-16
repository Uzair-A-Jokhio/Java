package Finals.Cricket;
/*
Question no 5:- A cricket team is usually identified by name. There are 11
players associated with the team.Each player has a name and age. Out of those
11 players, 6 are batsmen with good strike rate and average. The 4 players are
bowlers with their bowling_averages and total_number_of_wickets_taken. The
remaining 1 player is the wicket keeper batsman with number_of_stumps.
Develop classes and create their links with other classes where necessary
 */
public class Player {
    private String name;
    private int age;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }
}
