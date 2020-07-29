package acadamy.learnprogramming;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Deer", 12.54, "SourDough");
        super.addHamburgerAddition1("Chips", 2.45);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add extras to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add extras to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add extras to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add extras to deluxe burger");
    }
}
