package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in 125 is: " + sumDigits(125));
        int number = 9;
        while(number <= 30){
            System.out.println(sumDigits(number));
            number++;
        }
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int digit = 0;
        int totalSum = 0;
        while(number > 0) {
            //extract the least-sig digit
            digit = number % 10;
            //Add that digit to the sum
            totalSum += digit;
            //Drop the least-sig digit
            number /= 10;
        }

        return totalSum;
    }
}
