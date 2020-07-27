package acadamy.learnprogramming;

public class Printer {

    private int tonerLevel = 100;
    private int numOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter){
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.numOfPagesPrinted = 0;
    }

    public int fillToner(int amount){
        if((this.tonerLevel + amount > 0) && ((this.tonerLevel + amount) < 100)){
            this.tonerLevel += amount;
            System.out.println("Toner Filled Successfully by " + amount + ". Toner level is now " + this.tonerLevel);
            return this.tonerLevel;
        } else{
            System.out.println("Invalid Toner Value");
            return -1;
        }
    }

    public int printPages(int number){
        int pagesToPrint = number;
        if(this.duplexPrinter){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.numOfPagesPrinted += pagesToPrint;
        System.out.println("Printed " + pagesToPrint + " pages. Total Pages is now " + this.numOfPagesPrinted);
        this.tonerLevel -= number;
        System.out.println("Toner level dropped by " + number +  ". Toner level is now " + this.tonerLevel);
        return pagesToPrint;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public int getNumOfPagesPrinted(){
        return this.numOfPagesPrinted;
    }
}
