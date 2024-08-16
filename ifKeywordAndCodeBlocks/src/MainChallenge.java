public class MainChallenge {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);
        System.out.println("the next highscore is "+ calculateScore(true, 10000, 8,200));
        calculateScore(true, 10000,8,200);
    }

    public static int calculateScore(boolean gameOver, int score, int LevelComplete, int bonus){

        int finalScore = score;

        if (gameOver ) {
            finalScore +=( LevelComplete * bonus);
            finalScore += 1000;


        }
        return finalScore;
    }
}
