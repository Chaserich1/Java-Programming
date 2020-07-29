package acadamy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println("Enter 5 Values:\r");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed Array = " + Arrays.toString(array));

    }

    public static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
