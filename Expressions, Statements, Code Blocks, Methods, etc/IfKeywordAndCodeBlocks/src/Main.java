public class Main {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000) {
//            System.out.println("Your Score was less than 5000");
//        }else if(score > 5000){
//            System.out.println("Your score was greater than 5000");
//        }else{
//            System.out.println("Your score is equal to 5000");
//        }

        if(gameOver){
            int finalScore = score += (levelCompleted * bonus);
            System.out.println("Final Score is " + finalScore);
        }

        //Challenge
        if(gameOver){
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score += (levelCompleted * bonus);
            System.out.println("Second score is " + finalScore);
        }

    }
}
