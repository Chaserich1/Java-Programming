package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value: " + myMinFloatValue);
        System.out.println("Float Max Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value: " + myMinDoubleValue);
        System.out.println("Double Max Value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5.25;
        float myFloatValue1 = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue1);
        System.out.println("MyDoubleValue: " + myDoubleValue);

        double pounds = 200d;
        double resultingKilograms = pounds * 0.45359237d;
        System.out.println("Result: " + resultingKilograms);

    }
}
