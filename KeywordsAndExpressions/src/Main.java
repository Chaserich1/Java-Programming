public class Main {
    public static void main(String[] args){
        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
        }


        int score = 100;
        if(score > 99){
            System.out.println("You got the highscore!");
            score = 0;
        }
        /* The expressions are: */
        //score = 100
        //score > 99
        //"You got the highscore!"
        //score = 0

        System.out.println("This is a " +
                "Statement");
    }
}
