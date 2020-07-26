package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Set the dimensions
        Dimensions dimensions = new Dimensions(20,20,5);

        //Create the case and include the dimensions
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        //Create the monitor with resolution built in (no variable needed)
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        //Create the motherboard
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //Create our PC built from the case, monitor and motherboard components
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        /*Access drawPixelAt() function, loadProgram() function, and pressThePowerButton() function when they are public
        thePC.getTheCase().pressPowerButton();
        thePC.getTheMotherboard().loadProgram("Windows 1.0");
        thePC.getTheMonitor().drawPixelAt(1500, 1200, "red"); */

        //Access these when they are changed to private
        thePC.powerUp();

    }
}
