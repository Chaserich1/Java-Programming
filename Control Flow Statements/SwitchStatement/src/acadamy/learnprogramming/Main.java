package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value is one");
        } else if(value == 2){
            System.out.println("Value is two");
        } else{
            System.out.println("Value is not one or two");
        }

        int switchValue = 4;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually is was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char switchCharValue = 'F';

        switch(switchCharValue){
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C':
                System.out.println("Char is C");
                break;
            case 'D':
                System.out.println("Char is D");
                break;
            case 'E':
                System.out.println("Char is E");
                break;
            default:
                System.out.println("Char not found");
                break;
        }

        String switchMonthValue = "Jan";

        switch(switchMonthValue.toLowerCase()){
            case "jan":
                System.out.println("Month is Jan");
                break;
            default:
                System.out.println("Month is not Jan");
                break;
        }
    }
}
