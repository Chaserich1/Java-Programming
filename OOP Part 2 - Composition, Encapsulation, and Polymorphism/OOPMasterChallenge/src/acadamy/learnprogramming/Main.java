package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Basic Hamburger
        Hamburger hamburger = new Hamburger("Basic", "beef", 3.50, "white");
        double price = hamburger.addExtras();
        hamburger.addHamburgerAddition1("Lettuce", .25);
        hamburger.addHamburgerAddition2("Tomato", .30);
        hamburger.addHamburgerAddition3("Bacon", 1.00);
        System.out.println("Total Burger Price is " + hamburger.addExtras());

        //Healthy Burger with two extra additions
        HealthyBurger healthyBurger = new HealthyBurger("Onion", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 1.50);
        healthyBurger.addHealthAddition2("Avacado", 2.00);
        System.out.println("Total Burger Price is " + healthyBurger.addExtras());

        //Deluxe Burger with no extras allowed
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addExtras();
    }
}
