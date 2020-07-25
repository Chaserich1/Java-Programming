package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Explorer explorer = new Explorer(36);

        explorer.steer(45);

        explorer.accelerate(30);
        explorer.accelerate(20);
        explorer.accelerate(-42);


    }
}
