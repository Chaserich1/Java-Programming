package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour > 0){
            //Do calculation
            double milesPerHour = (kilometersPerHour / 1.609);
            long roundedMilesPerHour = Math.round(milesPerHour);
            return roundedMilesPerHour;
        }else if(kilometersPerHour == 0){
            return 0;
        }

        //If kilometersPerHour is less than 0
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }

    }
}
