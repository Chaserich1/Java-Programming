package acadamy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int[] myIntArray = new int[10];
        myIntArray[5] = 50; //Saves as element six

        //Initialize all elements
        int[] myNewIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myNewIntArray[7]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 50.0; //Saves as element six

        //Retrieve the element
        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[5]);

        //Another way with a for loop
        int[] myNewerIntArray = new int[10];
        for(int i = 0; i < myNewerIntArray.length; i++){
            myNewerIntArray[i] = i * 10;
        }

        printArray(myNewerIntArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element #" + i + ": " + array[i]);
        }
    }*/

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }

        System.out.println("The average of the input array is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        double average;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = (double) sum / (double) array.length;
        return average;
    }
}
