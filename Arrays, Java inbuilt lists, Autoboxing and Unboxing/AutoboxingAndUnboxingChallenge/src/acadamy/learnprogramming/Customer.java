package acadamy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    //Name and array list of doubles
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, double transaction){
        this.customerName = customerName;
        this.transactions.add(Double.valueOf(transaction));
    }

    public Customer(String customerName){
        this(customerName, 0.0);
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    //Method to add and display transactions
    public void addTransaction(double transactionAmount){
        this.transactions.add(transactionAmount);
    }

    public void displayTransactions(){
        for(int i = 0; i < transactions.size(); i++){
            System.out.println("Transaction #" + (i + 1) + ": $" + transactions.get(i).doubleValue());
        }
    }
}
