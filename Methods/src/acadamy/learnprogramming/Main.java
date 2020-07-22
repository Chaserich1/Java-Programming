package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int finalScore;
//        int finalScore2;
//        finalScore = calculateScore(true, 800, 8, 100);
//        finalScore2 = calculateScore(false, 1000, 10, 100);
//        System.out.println(finalScore);
//        System.out.println(finalScore2);
//
        displayHighScorePosition("Chase", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(900));
        displayHighScorePosition("David", calculateHighScorePosition(400));
        displayHighScorePosition("Sarah", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100) {
            position = 3;
        }

        return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score += (levelCompleted * bonus);
            return finalScore;
        }

        return -1;

    }
}
