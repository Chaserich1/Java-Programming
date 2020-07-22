package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(0));
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
