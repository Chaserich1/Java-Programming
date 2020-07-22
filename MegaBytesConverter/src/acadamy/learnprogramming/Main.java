package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0){
            int megaBytes = kiloBytes / 1024;
            int roundedMegaBytes = Math.round(megaBytes);
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + roundedMegaBytes + " MB and " + remainingKiloBytes + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
