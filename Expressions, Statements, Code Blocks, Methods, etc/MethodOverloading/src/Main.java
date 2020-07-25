public class Main {
    public static void main(String[] args){
        /*int newScore = calculateScore("Chase", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(200);
        calculateScore();*/

        calcFeetAndInchesToCentimeters(157);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println("Total Centimeters: " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet  = (int) inches / 12;
        double leftoverInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, leftoverInches);
    }
    /*public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed Player scored unknown points");
        return 0;
    }*/


}
