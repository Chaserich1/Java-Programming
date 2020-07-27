package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Create the printer
        Printer printer = new Printer(100,true);

        //Print the starting Values
        System.out.println("Starting Number of pages printed: " + printer.getNumOfPagesPrinted());
        System.out.println("Starting Toner Level: " + printer.getTonerLevel());

        //Call the printPages function with a value
        printer.printPages(20);
        //Call fillToner function with amount
        printer.fillToner(15);


    }
}
