package acadamy.learnprogramming;

public class Main {

    public static final int BIG_BAG_SIZE = 5;
    public static final int SMALL_BAG_SIZE = 1;

    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        //Sum the kilos (big bags are 5 kilos and small bags are 1 kilo)
        int sumOfKilos = (bigCount * BIG_BAG_SIZE) + (smallCount * SMALL_BAG_SIZE);

        //Return false if the sum of kilos is less than the goal
        if(sumOfKilos < goal){
            return false;
        }
        //Make sure only full bags are used towards the goal amount

    }
}
