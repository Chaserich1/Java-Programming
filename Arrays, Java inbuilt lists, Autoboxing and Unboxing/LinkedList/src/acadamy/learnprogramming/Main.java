package acadamy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Chase", 54.96);
        Customer customer2;
        customer2 = customer; //customer2 points to customer memory address
        customer2.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        //3 and 4 have to move down, and if this was a huge array list, it would cost a lot. Same goes for deleting an element
        intList.add(1,2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }



    }
}
