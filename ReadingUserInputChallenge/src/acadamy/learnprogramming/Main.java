package acadamy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Init the scanner
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        //Loop for taking in and requesting the numbers
        while(count <= 10){
            System.out.println("Enter number #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                //Read the number
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else{
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //Handle end of line enter key
        }

        //Print the sum of the 10 numbers
        System.out.println("The sum of the ten numbers is: " + sum);

        scanner.close();
    }
}
