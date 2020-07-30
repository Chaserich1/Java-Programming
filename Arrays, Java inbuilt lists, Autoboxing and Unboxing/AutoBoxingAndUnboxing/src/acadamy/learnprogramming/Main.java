package acadamy.learnprogramming;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue){
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Chase");

        //ArrayList<int> intArrayList = new ArrayList<int>(); //Can't use primitive types in arraylist

        //We can create a wrapper class for the value to add the object to the array list
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54)); //first object in the arraylist with a myvalue of 54 based on the above class

        //AutoBoxing allows you to store the integers to array list without building a class because Integer is a class
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.23);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            integerArrayList.add(Integer.valueOf(i)); //Converts primitive type to value of integer class
        }

        //Unboxing is where we take it from the Integer class and convert back to a primitive type
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " ---> " + integerArrayList.get(i).intValue()); //Convert it back to the primitive type
        }

        //Shorter way of doing the above using autoboxing and unboxing due to the help of JAVA
        Integer myIntValue = 56;
        //Integer myIntValue = Integer.valueOf(56) is what is happening at compile time
        int myInt = myIntValue; //Java is doing myIntValue.intValue(); automatically

        //Autoboxing and unboxing with a double
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
//            myDoubleValues.add(Double.valueOf(dbl));
//        }
//
//        for(int i = 0; i < myDoubleValues.size(); i++){
//            double value = myDoubleValues.get(i).doubleValue();
//            System.out.println(i + " ---> " + value);
//        }

        //Using shortcut
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }
    }
}
