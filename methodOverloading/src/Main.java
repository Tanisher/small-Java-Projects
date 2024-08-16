public class Main {

    public static void main(String[] args) {

        int newScore=calculateScore("Sire",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
      System.out.println("player " + playerName + " scored " + score+ " points");
      return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("player un named player scored " + score+ " points");
        return score *1000;
    }
    public static int calculateScore(){
        System.out.println("no player name no player score");
        return 0;
    }

}
