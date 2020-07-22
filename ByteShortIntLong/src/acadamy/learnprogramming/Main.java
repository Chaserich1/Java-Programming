package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;

        System.out.println("Short Min Value: " + myShortMinValue);
        System.out.println("Short Max Value: " + myShortMaxValue);

        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;

        System.out.println("Long Min Value: " + myLongMinValue);
        System.out.println("Long Max Value: " + myLongMaxValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("Big Long Literal Value: " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByte = (byte)(myMinByteValue / 2);
        short myNewShort = (short)(myShortMinValue / 2);

        /* Primitive Types Challenge */
        byte validByteNumber = 10;
        short validShortNumber = 20;
        int validIntNumber = 50;
        long calculatedLongValue = 50000L + 10L * (validByteNumber + validShortNumber + validIntNumber);
        System.out.println("Total Challenge Number: " + calculatedLongValue);


    }
}
