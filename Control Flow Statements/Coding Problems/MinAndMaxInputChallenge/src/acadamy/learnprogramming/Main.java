package acadamy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Init the scanner
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                if(first){
                    min = number;
                    max = number;
                    first = false;
                }else {
                    if (number > max) {
                        max = number;
                    } else if (number < min) {
                        min = number;
                    }
                }
            } else{
                break;
            }
            scanner.nextLine(); //Handle the enter key
        }

        System.out.println("Min: " + min + ", Max: " + max);

        //Close the scanner
        scanner.close();
    }
}
