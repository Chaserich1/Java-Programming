package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        //If we change this field to fullName in player class, we have to also make the change here which is bad
//        player.name = "Chase";
//        player.health = 100;
//        player.weapon = "Gun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; //This is bad, we shouldn't be able to auto change just control
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Chase", 50, "Gun"); //Gives 50
        //Can't directly access the fields anymore, now have to use the getter which is good
        System.out.println("Initial health is " + player.getHealth());
        EnhancedPlayer player1 = new EnhancedPlayer("Chase", 200, "Gun"); //Defaults to 100
        //Can't directly access the fields anymore, now have to use the getter which is good
        System.out.println("Initial health is " + player1.getHealth());
    }
}
