public class Main {

    public static void main(String[] args){

        double doubleVar = 20.00d;
        double secondDoubleVar = 80.00d;
        double result = (doubleVar + secondDoubleVar) * 100.00d;

        double remainder = result % 40.00d;
        boolean booleanVar = (remainder == 0) ? true : false;
        System.out.println(booleanVar);

        if(!booleanVar){
            System.out.println("Got some remainder");
        }
    }
}
