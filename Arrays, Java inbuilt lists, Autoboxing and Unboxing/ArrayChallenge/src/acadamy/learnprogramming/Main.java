package acadamy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Get the integers entered by the user
        int[] myIntArray = getIntegers(5);

        //Print the array to ensure it worked
        printArray(myIntArray);

        //Sort the decending array and then print it again
        int[] mySortedIntArray = sortIntegers(myIntArray);
        printArray(mySortedIntArray);

        //Optimized ascending
        int[] myOptSortedIntArr = optimizeSortIntegers(myIntArray);
        printArray(myOptSortedIntArr);
    }

    //Get the integers entered by the user
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r");
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Print the array to ensure it worked
    public static void printArray(int[] array){
        System.out.println("Array Values:");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        int[] sortedArray = new int[unsortedArray.length];
        for(int i = 0; i < unsortedArray.length; i++){
                sortedArray[i] = unsortedArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static int[] optimizeSortIntegers(int[] unsortedArray){
        //Copy unsorted to sorted array
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
