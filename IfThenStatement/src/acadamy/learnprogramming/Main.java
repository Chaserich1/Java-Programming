package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = true;
        if(isAlien){
            System.out.println("It is not an Alien");
        }else{
            System.out.println("It is an Alien");
        }

        boolean wasAlien = isAlien ? true : false;
        if(wasAlien){
            System.out.println("Was Alien is true");
        }
    }
}
