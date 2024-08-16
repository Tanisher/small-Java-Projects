public class methodsChallenge {
    public static void displayHighScorePosition(String playername, int position){
        System.out.println( playername+" managed to get into "+ position+ " position on the list");
    }
    public static int calculateHighScorePosition(int score){
        int result = 0;
        if (score >= 1000 ){
            result = 1;
        }else if((score >= 500) && (score<1000)) {
            result = 2;
        }else if((score >=100) && (score<500)){
            result = 3;
        }else{
            result = 4;
        }
        return result;
    }
    public static void main (String[] args){
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Sire",position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("me",position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("you",position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("us",position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("damn",position);

    }
}
