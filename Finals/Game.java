package Finals;
/*      QUS 3
 A student develops a game with help menu, player_contol and
top_score. Guide the student in development by defining the class ‘GAME’ with
the appropriate methods for following implementation:

a. Player_control has Boolean variables of left, right, forward and backward
b. Top_score initialized by zero
c. Help menu that contains important instructions
 */
public class Game {
    private boolean left;
    private boolean right;
    private boolean forward;
    private boolean backward;

    private int Top_score;


    public Game(){
        this.left = false;
        this.right = false;
        this.forward = false;
        this.backward = false;
        this.Top_score = 0;
    }

    public void setLeft(boolean left){ 
        this.left = left;}
    public void setRight(boolean right){ 
        this.right = right;}
    public void setForward(boolean forward){
        this.forward = forward;}
    public void setBackward(boolean Back){
        this.backward = Back;}

    public String getPlayerStatus(){
        return "Player Control: Left: " + left + " Right: " + right + " Forward: " + forward + " Backward: " + backward;
    }

    public int getTopScore(){
        return Top_score;
    } 

    public void setTopScore(int score){
        if (score > Top_score){
            this.Top_score = score;
        }
    }

    public void displayHelp(){
        System.out.println("Help Menu:");
        System.out.println("1. Use arrow keys for movement.");
        System.out.println("2. Avoid obstacles to increase your score.");
        System.out.println("3. The top score is " + Top_score + ".");
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage of the Game class
        Game myGame = new Game();
        myGame.displayHelp();
        System.out.println(myGame.getPlayerStatus());
        myGame.setForward(true);
        myGame.setRight(true);
        System.out.println(myGame.getPlayerStatus());
        myGame.setTopScore(100);
        System.out.println("Updated Top Score: " + myGame.getTopScore());
    }
}
