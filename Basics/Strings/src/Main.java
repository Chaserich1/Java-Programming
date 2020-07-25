public class Main {

    public static void main(String[] args)
    {
        //Primitive Types: byte, short, int, long, float, double, char, boolean
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and my name is chase.";
        System.out.println(myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println(lastString);

    }
}
