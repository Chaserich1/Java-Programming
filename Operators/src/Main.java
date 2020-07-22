public class Main {

    public static void main(String[] args){

        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        result--;
        result += 2;
        result *= 10;
        result /= 2;
        result -= 5;
    }
}
