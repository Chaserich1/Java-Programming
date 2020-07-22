package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count Value is: " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//
//        count = 1;
//        do{
//            System.out.println("Count Value is: " + count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        }while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int totalEvens = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number: " + number);
            totalEvens++;
            if(totalEvens >= 5){
                break;
            }
        }
        System.out.println("Total Evens Found: " + totalEvens);


    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
