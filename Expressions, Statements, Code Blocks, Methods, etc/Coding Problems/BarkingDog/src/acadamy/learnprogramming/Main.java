package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if(barking == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }
}
